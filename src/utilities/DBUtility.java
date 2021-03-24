package utilities;

import models.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class will simulate getting information from a database
 */
public class DBUtility {

    public static List<String> getAvailableCourseCodes()
    {
        return Arrays.asList("COMP 1002", "COMP 1030", "COMP 1035", "COMP 1045",
                "COMP 1045", "MATH 1003", "COMP 1006", "COMP 1008",
                "COMP 1098", "COMP 2003", "ENTR 1002", "COMP 1009",
                "COMP 1011", "COMP 1073", "COMP 2084", "COMP 3002",
                "COMP 2068");
    }

    public static ArrayList<Student> getStudentsFromDB()
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Rose","Ruffner","3846 St. Paul StreetSt Catharines ON L2S 3A1", LocalDate.of(1975,8,27)));
        students.add(new Student("Jack","Bradbury","867 rue des Églises Est Ste Cecile De Masham QC J0X 2W0", LocalDate.of(1979,10,14)));
        students.add(new Student("Elanore","Sanders","1145 47th Avenue Grassland AB T0A 1V0", LocalDate.of(1940,9,25)));
        students.add(new Student("Nancy","Walsh","1459 Harvest Moon Dr Unionville ON L3R 0L7", LocalDate.of(1999,1,12)));
        students.add(new Student("Greta","Tolbert","642 Front Street Toronto ON M5J 2N1", LocalDate.of(1957,12,18)));
        students.add(new Student("Barbara","Gable","3671 Scotchmere Dr Sarnia ON N7T 7T9", LocalDate.of(2002,11,13)));
        return students;
    }
 }
