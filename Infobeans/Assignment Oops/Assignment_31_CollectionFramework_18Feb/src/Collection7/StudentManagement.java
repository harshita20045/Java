package Collection7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class Student {
    private String studentName;
    private int studentId;
    private String studentCourse;

    public Student(String studentName, int studentId, String studentCourse) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentCourse = studentCourse;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    @Override
	public int hashCode() {
		return Objects.hash(studentId);
	}

   
    @Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Student other = (Student) obj;
		return  studentId == other.studentId;
	}

	@Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentCourse=" + studentCourse + "]";
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Student> s = new HashSet<>();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student details:");

            System.out.print("Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Student ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Student Course: ");
            String course = scanner.nextLine();

            Student obj = new Student(name, id, course);
           s.add(obj);
        }

       

        System.out.println("\nList of All Students:");
        for (Student i : s) {
            System.out.println(i);
        }
    }
}
