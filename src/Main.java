import models.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Fred","Flintstone","1 Bedrock", LocalDate.of(1986,3,17));
        Person p2 = new Person("Wilma","Flintstone","1 Bedrock", LocalDate.of(1986,3,18));

        System.out.println(p1);
        System.out.println(p2);

    }
}
