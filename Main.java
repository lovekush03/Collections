import java.util.*;


class Student{
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "Id: "+this.id+" Name: "+this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class Main {
    public static void main(String[] args) {

        Set<Student> hs = new HashSet<>();
        hs.add(new Student(1,"Aman"));
        hs.add(new Student(1,"Aman"));
        hs.add(new Student(2,"Rohit"));
        hs.add(new Student(2,"Rohit"));
        hs.add(new Student(3,"Rohan"));

        System.out.println(hs);
    }
}
