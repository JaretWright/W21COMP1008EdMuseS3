import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
//        Person p1 = new Person("Fred","Flintstone","1 Bedrock", LocalDate.of(1986,3,17));
//        Person p2 = new Person("Wilma","Flintstone","1 Bedrock", LocalDate.of(1986,3,18));
//
//        System.out.println(p1);
//        System.out.println(p2);
//
//        TreeMap<String, Integer> grades = new TreeMap<>();
//        grades.put("COMP 1008",98);
//        grades.put("COMP 1030",72);
//        grades.put("COMP 1011",100);
//        grades.put("COMP 3025",92);
//
//        ArrayList<Person> people = new ArrayList<>();
//        people.add(p1);
//        people.add(p2);
//
//        System.out.println("\n--- Playing with Map's ---");
//        System.out.println(people.get(0));
//
//        //to get something from a Map object, we provide the key (instead of the index)
//        System.out.println("The grade for COMP 1008: " + grades.get("COMP 1008"));
//
//        //loop over an ArrayList
//        for (Person person : people)
//            System.out.println(person);
//
//        for (String key : grades.keySet())
//            System.out.printf("key: %s  value: %d%n",key, grades.get(key));

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/dashboardView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("EdMuse");
        stage.show();
    }
}
