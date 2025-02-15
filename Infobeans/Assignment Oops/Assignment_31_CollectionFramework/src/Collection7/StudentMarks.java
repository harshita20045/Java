package Collection7;

import java.util.Scanner;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    String name;
    int rollNo;
    double marks;

    // Constructor
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

	// Sorting by marks in ascending order
	@Override
	public int compareTo(Student s) {
		return Double.compare(this.marks, s.marks);
	}

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Roll No=" + rollNo + ", Marks=" + marks + "]";
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TreeSet will now sort students by marks in ascending order
        TreeSet<Student> t1 = new TreeSet<>();

        int choice = 0;
        do {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            int rollNo = Integer.parseInt(sc.nextLine());
            System.out.print("Enter marks: ");
            double marks = Double.parseDouble(sc.nextLine());
            
            Student s = new Student(name, rollNo, marks);
            t1.add(s);  // Now it works!

            System.out.println("\nEnter -1 to stop, else any number to continue:");
            choice = Integer.parseInt(sc.nextLine());
        } while (choice != -1);

        // Display sorted students
        System.out.println("\nStudents sorted by marks (Ascending Order):");
        for (Student s : t1) {
            System.out.println(s);
        }

        sc.close();
    }
}
