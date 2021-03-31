package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import models.Student;
import utilities.DBUtility;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateStudentViewController implements Initializable {

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField addressTextField;

    @FXML
    private DatePicker birthdayDatePicker;

    @FXML
    private Label errMsgLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        errMsgLabel.setText("");
    }

    @FXML
    private void submitButton()
    {
        try {
            Student newStudent = new Student(firstNameTextField.getText(),
                    lastNameTextField.getText(),
                    addressTextField.getText(),
                    birthdayDatePicker.getValue());

            //1. insert the student into the database
            int studentNum = DBUtility.insertNewStudent(newStudent);

            //2. clear the fields
            clearFields();

            //3. display the new student object
            errMsgLabel.setText("Student Num: "+studentNum + " "+ newStudent.toString());
        } catch (IllegalArgumentException e)
        {
            errMsgLabel.setText(e.getMessage());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void clearFields()
    {
        firstNameTextField.clear();
        lastNameTextField.clear();
        addressTextField.clear();
        birthdayDatePicker.getEditor().clear();
    }

    @FXML
    private void changeToDashboard(ActionEvent event)
    {

    }
}