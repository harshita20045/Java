package java8_5;

import java.util.ArrayList;
import java.util.List;

class Student4 {

	private String name;
	private int marks;

	public Student4(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
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
		return "Student4 [name=" + name + ", marks=" + marks + "]";
	}

}

public class StudentMain4 {
	public static void main(String[] args) {
		Student4 s1 = new Student4("Harshita", 20);
		Student4 s2 = new Student4("Harshit", 19);
		Student4 s3 = new Student4("Harshi", 16);
		Student4 s4 = new Student4("Harsh", 23);
		Student4 s5 = new Student4("Hars", 67);
		Student4 s6 = new Student4("Har", 54);
		Student4 s7 = new Student4("Ha", 10);
		Student4 s8 = new Student4("H", 20);
		ArrayList<Student4> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		l.add(s8);

		List<String> l1 = l.stream().filter(x -> x.getMarks() < 40).map((x) -> x.getName()).toList();
		l1.forEach(w -> System.out.println(w));

	}
}
