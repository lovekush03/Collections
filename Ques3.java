//Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value and perform reverse sorting of salary with the help of Comparator.

import java.util.*;

class Employee1{
    String name;
    int age;
    String designation;
    int salary;

    Employee1(String name,int age ,String designation, int salary){
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public String toString(){
        return "Employee -> Name: "+this.name+" Age: "+this.age+" Designation: "+this.designation;
    }
}
public class Ques3 {

    public static void main(String[] args) {
        Map<Employee1,Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee1("Karan",22,"Java Developer",20000),20000);
        employeeMap.put(new Employee1("Rohan",25,"QE Tester",30000),30000);
        employeeMap.put(new Employee1("Aman",23,"MERN Developer",22000),22000);
        employeeMap.put(new Employee1("Lovepreet",22,"Software Developer",15000),15000);

        //Create a Entry Set
        Set<Map.Entry<Employee1,Integer>> entry = employeeMap.entrySet();

        //Convert the Entry set into an arrayList for applying sort function\

        List<Map.Entry<Employee1,Integer>> list = new ArrayList<>(entry);

        //Apply comparator on list
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(((Map.Entry)(o1)).getValue )
            }
        });

//        Collections.sort(employeeMap, new Comparator<Employee1>() {
//            @Override
//            public int compare(Employee1 o1, Employee1 o2) {
//                return 0;
//            }
//        })
//}
}
