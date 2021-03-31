package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
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
            DBUtility.insertNewStudent(newStudent);

            //2. clear the fields
            //3. display the new student object
        } catch (IllegalArgumentException e)
        {
            errMsgLabel.setText(e.getMessage());
        } catch (Exception e)
        {
            errMsgLabel.setText("Check all fields for values");
        }

    }
}