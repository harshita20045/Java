package Collection10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class StudentName implements Comparator<Student>
{
	public int compare(Student i1,Student i2) {
		return i1.getName().compareTo(i2.getName());
	}
	}
class RollNo implements Comparator<Student>
{
	public int compare(Student i1,Student i2) {
		if(i1.getRollNo()<i2.getRollNo()) 
		{
			return -1;
		}
		else if(i1.getRollNo()>i2.getRollNo()) 
		{
			return +1;
		}
		else 
		{
			return 0;
		}
	}
}
class Student implements Comparable<Student>
{
   private int rollNo;
   private String name;
   private int totalMarks;
   
public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getTotalMarks() {
	return totalMarks;
}

public void setTotalMarks(int totalMarks) {
	this.totalMarks = totalMarks;
}

public Student(int rollNo, String name, int totalMarks) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.totalMarks = totalMarks;
}

@Override
public int compareTo(Student o) {
	if(this.getTotalMarks()<o.getTotalMarks()) 
	{
		return +1;
	}
	else if(this.getTotalMarks()>o.getTotalMarks()) 
	{
		return -1;
	}
	else
	{
		return 0;
	}
	
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", totalMarks=" + totalMarks + "]";
}  
   
}

public class StudentMain {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	ArrayList<Student> t=new ArrayList<>();
	while(true) 
	{
		System.out.println("Press 1 ---> Add Student Detail");
		System.out.println("Press 2 ---> Print");
		System.out.println("Press 3 ---> Sort by name");
		System.out.println("Press 4 ---> Sort by roll number");
		System.out.println();
		System.out.println("Enter your choice : ");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice) 
		{
		case 1: System.out.print("Enter roll no : ");
		int rn=Integer.parseInt(sc.nextLine());
		 System.out.print("Enter name : ");
		String name =sc.nextLine();
		 System.out.print("Enter marks : ");
	int m=Integer.parseInt(sc.nextLine());
		
		Student p=new Student(rn,name,m);
		t.add(p);
		break;
		case 2:System.out.println("Total Marks : ");
		Collections.sort(t);
		System.out.println(t);
		break;
		case 3:System.out.println("Name : ");
		t.sort(new StudentName());
		System.out.println(t);
		break;
		case 4:System.out.println("Roll Number : ");
		t.sort(new RollNo());
		System.out.println(t);
		break;
		

		}
		
	}
}
}