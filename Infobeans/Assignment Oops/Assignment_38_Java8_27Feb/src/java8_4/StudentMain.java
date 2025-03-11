package java8_4;

import java.util.ArrayList;

class Student 
{
	private int id;
	private String name;
	private int age;
	private double marks;
	private String department;

	public Student(int id,String name,int age,double marks,String department)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
		this.department=department;
	}

	public int getId()
	{
		return id;
	}
	public String getName()
	{
 		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getMarks()
	{
		return marks;
	}
	public String getDepartment()
	{
		return department;
	} 
	public String toString()
	{
		return id+" : "+name+" : "+age+" : "+marks+" : "+department;
	}
}

public class StudentMain
{
	public static void main(String args[])
	{
		Student s1=new Student(1,"Harshita",20,90,"Information Technology");
		Student s2=new Student(2,"Arshita",29,91,"Artificial Intelligence");
		Student s3=new Student(3,"Rshita",18,12,"Mechanical Engineering");
		Student s4=new Student(4,"Shita",17,93,"Computer Science");
		Student s5=new Student(5,"Hita",26,54,"Computer Science");
		Student s6=new Student(6,"Ita",15,95,"Artificial Intelligence");
		Student s7=new Student(7,"Ta",14,69,"Mechanical Engineering");
		Student s8=new Student(8,"A",13,75,"Artificial Intelligence");

		ArrayList<Student> l=new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		l.add(s8);
		
		

System.out.println("Display students who have marks greater than 75");
l.stream().filter(x->x.getMarks()>75).forEach(w->System.out.println(w));
System.out.println();
System.out.println("Display students who belong to the 'Computer Science' department");
l.stream().filter(x->x.getDepartment().equals("Computer Science")).forEach(w->System.out.println(w));
System.out.println();
System.out.println("Display students who are older than 20 years");
l.stream().filter(x->x.getAge()>20).forEach(w->System.out.println(w));
System.out.println();
System.out.println("Display students whose names start with 'A'");
l.stream().filter(x->x.getName().startsWith("A")).forEach(w->System.out.println(w));

	}
}