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

//        Iterator it = list.iterator();
        System.out.println("Before Sorting: ");
        for(Map.Entry<Employee1,Integer> emp : list){
            System.out.println(emp);
        }

        //Apply comparator on list
        Collections.sort(list, new Comparator<Map.Entry<Employee1,Integer>>() {
            @Override
            public int compare(Map.Entry<Employee1,Integer> o1,Map.Entry<Employee1,Integer>  o2) {
                if(o1.getValue() > o2.getValue()) return -1;
                else return 1;
            }
        });

        System.out.println("After Sorting: ");
        for(Map.Entry<Employee1,Integer> emp : list){
            System.out.println(emp);
        }

    }
}
