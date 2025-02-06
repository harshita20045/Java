package Collection2;
import java.util.ArrayList;

class Student {
    String name;
    int age;
    double marks;
    
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Marks: " + marks;
    }
}

public class Que2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("A", 20, 85.5));
        students.add(new Student("B", 21, 78.0));
        students.add(new Student("C", 19, 92.3));
        
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
