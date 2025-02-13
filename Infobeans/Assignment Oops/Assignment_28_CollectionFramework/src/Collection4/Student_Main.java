package Collection4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Student1 {
    private String name;
    private int rollNo;
    private int totalMarks;

    public Student1(String name, int rollNo, int totalMarks) {
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

public class Student_Main {
    Set<Student1> students = new HashSet<>();

    public void addStudent(Student1 s) {
        students.add(s);
    }

    public void displayStudents() {
        for (Student1 s : students) {
            System.out.println("Name: " + s.getName() + ", Total Marks: " + s.getTotalMarks());
        }
    }

    // Remove student using an iterator
    public void removeStudent(int rollNo) {
        Iterator<Student1> itr = students.iterator();
        boolean found = false;
        while (itr.hasNext()) {
            Student1 s = itr.next();
            if (s.getRollNo() == rollNo) {
                itr.remove();
                System.out.println("Student with Roll No " + rollNo + " removed.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with Roll No " + rollNo + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Main demo = new Student_Main();

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 -> Add a student");
            System.out.println("2 -> Display student names and marks");
            System.out.println("3 -> Remove a student");
            System.out.println("4 -> Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter roll no: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter total marks: ");
                    int marks = sc.nextInt();
                    demo.addStudent(new Student1(name, roll, marks));
                    break;
                case 2:
                    demo.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter roll number to remove: ");
                    int rollNo = sc.nextInt();
                    demo.removeStudent(rollNo);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
