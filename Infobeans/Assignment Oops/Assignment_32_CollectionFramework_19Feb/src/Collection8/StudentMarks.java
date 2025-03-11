package Collection8;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Student implements Comparator<Student> {
    String name;
    int rollNo;
    double marks;

    public Student() {}
                                                                                   
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

	
	public int compare(Student i1,Student i2) {
		if(i1.getMarks()<i2.getMarks())
		{
			return -1;
		}
		else if(i1.getMarks()>i2.getMarks())
		{
			return +1;
		}
		else
		{
			return 0;
		}
	}

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Roll No=" + rollNo + ", Marks=" + marks + "]";
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        TreeSet<Student> t1 = new TreeSet<>(new Student());

        int choice = 0;
        do {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            int rollNo = Integer.parseInt(sc.nextLine());
            System.out.print("Enter marks: ");
            double marks = Double.parseDouble(sc.nextLine());
            
            Student s = new Student(name, rollNo, marks);
            t1.add(s);  

            System.out.println("\nEnter -1 to stop, else any number to continue:");
            choice = Integer.parseInt(sc.nextLine());
        } while (choice != -1);

        System.out.println("\nStudents sorted by marks (Ascending Order):");
        for (Student s : t1) {
            System.out.println(s);
        }

        sc.close();
    }
}
