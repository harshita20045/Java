package Feb26;

import java.util.function.Function;

class Student{
	
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
public class Ex2 {
	public static void main(String[] args) {
		Function<Student,String> f=x->{
			int marks=x.getMarks();
			String grade="";
			if(marks>=85)
				grade="A";
			else if(marks>=70)
				grade="B";
		   else
			    grade ="C";
			return grade;
			
		};
			Student[] s= {
					new Student(101, "fdg", 45),
					new Student(102, "adg", 455),
					new Student(103, "rdg", 43)
					};
		
	}
}
