package java8_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student5 {
	private String name;
	private int age;
	private double marks;

	public Student5(String name, int age, double marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student5 [name=" + name + ", age=" + age + ", marks=" + marks + "]\n";
	}

}

public class StudentMain5 {
	public static void main(String[] args) {
		Student5 s1 = new Student5("Harshita", 20, 24);
		Student5 s2 = new Student5("H", 19, 52);
		Student5 s3 = new Student5("Harshi", 16, 56);
		Student5 s4 = new Student5("Harsh", 23, 132);
		Student5 s5 = new Student5("Hars", 67, 332);
		Student5 s6 = new Student5("Har", 54, 112);
		Student5 s7 = new Student5("Ha", 10, 34);
		Student5 s8 = new Student5("Harshit", 20, 23);
		ArrayList<Student5> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		l.add(s8);
	List<Student5> l1=	l.stream().filter(x -> x.getMarks() > 50).map(y -> {
			y.setName(y.getName().toUpperCase());
			return y;
		}).sorted((a, b) -> {
			return a.getName().compareTo(b.getName());
		}).collect(Collectors.toList());
		System.out.println(l1);

	}
}
