package Collection4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private String name;
    private int rollNo;
    private int totalMarks;

    public Student(String name, int rollNo, int totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Roll No=" + rollNo + ", Total Marks=" + totalMarks + "]";
    }
}

public class StudentListMain {

    // Method to create and return a list of students.
    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Harish", 1, 85));
        students.add(new Student("Bob", 2, 70));
        students.add(new Student("Alice", 3, 95));
        students.add(new Student("Henry", 4, 80));
        students.add(new Student("Brenda", 5, 65));
        return students;
    }

    public static void main(String[] args) {
        // Get the list of students
        List<Student> studentList = getAllStudents();

        // 1. Retrieve and display the student(s) whose name starts with "H"
        System.out.println("Student(s) whose name starts with 'H':");
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().startsWith("H")) {
                System.out.println(student);
            }
        }

        // 2. Calculate the average of all the marks of the students
        int sum = 0;
        int count = 0;
        iterator = studentList.iterator(); // reinitialize the iterator
        while (iterator.hasNext()) {
            Student student = iterator.next();
            sum += student.getTotalMarks();
            count++;
        }
        double average = (count != 0) ? (double) sum / count : 0.0;
        System.out.println("\nAverage marks of all students: " + average);

        // 3. Remove the student(s) whose name starts with "B" using an iterator
        iterator = studentList.iterator(); // reinitialize the iterator
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().startsWith("B")) {
                System.out.println("\nRemoving student: " + student);
                iterator.remove();
            }
        }

        // Display the list after removal
        System.out.println("\nList of students after removal:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}

