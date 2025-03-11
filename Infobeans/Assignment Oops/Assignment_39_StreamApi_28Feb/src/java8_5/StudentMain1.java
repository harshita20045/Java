package java8_5;

import java.util.ArrayList;

class Student1 {
	private String name;
	private int marks;

	public Student1(String name, int marks) {
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
		return "Student1 [name=" + name + ", marks=" + marks + "]";
	}

}

public class StudentMain1 {

	public static void main(String[] args) {

		ArrayList<Student1> l = new ArrayList<>();
		Student1 s1 = new Student1("Harshita", 90);
		Student1 s2 = new Student1("Harshit", 60);
		Student1 s3 = new Student1("Harshi", 100);
		Student1 s4 = new Student1("Harsh", 1020);
		Student1 s5 = new Student1("Hars", 70);
		Student1 s6 = new Student1("Har", 30);
		Student1 s7 = new Student1("Ha", 300);
		Student1 s8 = new Student1("H", 200);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		l.add(s8);

		l.stream().sorted((x, y) -> {
			if (x.getMarks() < y.getMarks())
				return +1;
			else if (x.getMarks() > y.getMarks())
				return -1;
			else
				return 0;
		}).forEach(w->System.out.println(w));

	}
}
