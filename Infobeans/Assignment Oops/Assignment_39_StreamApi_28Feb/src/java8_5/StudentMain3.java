package java8_5;

import java.util.ArrayList;
import java.util.Optional;

class Student3{
	private String name;
	private int age;
	public Student3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + "]";
	}
	
}
public class StudentMain3 {

	public static void main(String[] args) {
		ArrayList<Student3> l = new ArrayList<>();
		Student3 s1 = new Student3("Harshita", 20);
		Student3 s2 = new Student3("Harshit", 19);
		Student3 s3 = new Student3("Harshi", 16);
		Student3 s4 = new Student3("Harsh", 23);
		Student3 s5 = new Student3("Hars", 67);
		Student3 s6 = new Student3("Har", 54);
		Student3 s7 = new Student3("Ha", 10);
		Student3 s8 = new Student3("H", 20);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		l.add(s8);
		
		boolean b =l.stream().anyMatch(x->x.getAge()<18);
		System.out.println(b);
	}
}
