package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1;
    @BeforeEach
    void setUp() {
        p1 = new Person("Fred","Flintstone","1 Bedrock Lane", LocalDate.of(1990,03,18));
    }

    @Test
    void getAge() {
    }
}