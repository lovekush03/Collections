import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ques2Test {
    Employee emp;
    @BeforeEach
    void setup(){
         emp = new Employee(22,20000,"Lovepreet Singh");
    }
    @Test
    void checkCompare(){
        Employee emp2 = new Employee(22,25000,"Harpreet Singh");
        Employee emp3 = new Employee(25,30000,"Karanpreet Singh");
        Employee emp4 = new Employee(22,35000,"Karanpreet Singh");

        assertEquals(-1,emp2.compareTo(emp));
        assertEquals(1,emp3.compareTo(emp2));
        assertEquals(0,emp3.compareTo(emp4));

    }
    @Test
    void checkToString(){
        String expected = "Employee Name: Lovepreet Singh Age: 22.0 Salary: 20000.0";

        assertEquals(expected,emp.toString());
    }


}