//Given the following class Employee class{ Double Age; Double Salary; String Name} Design the class in such a way that the default sorting should work on firstname and lastname. Also, Write a program to sort Employee objects based on salary using Comparator.

import org.junit.jupiter.api.Test;

import java.util.*;

class Employee implements Comparable<Employee> {
    double age;
    double salary;
    String name;

    Employee(double age, double salary, String name){
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.name.compareTo(o.name) > 0) return 1;
        else if(this.name.compareTo(o.name) < 0) return -1;
        else return 0;
    }

    @Override
    public String toString(){
        return "Employee Name: "+this.name+" Age: "+this.age+" Salary: "+this.salary;
    }
}
public class Ques2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee(22,20000,"Karan"),
                new Employee(22,15000,"Lovepreet"),
                new Employee(23,22000,"Aman"),
                new Employee(25,30000,"Rohan")
        ));
        System.out.println("Sorting employees on the basis of name");
        Collections.sort(employees);
        for (Employee emp :employees){
            System.out.println(emp);
        }


        System.out.println("Sorting on the basis of Salary");


        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.salary < o2.salary) return 1;
                else return -1;
            }
        });
        for (Employee emp : employees){
            System.out.println(emp);
        }

    }
}
