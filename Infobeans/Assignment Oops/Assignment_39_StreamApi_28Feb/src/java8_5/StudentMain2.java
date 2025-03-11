package java8_5;

import java.util.ArrayList;
import java.util.Optional;

class Student2{
	private String name;
	private int age;
	public Student2(String name, int age) {
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
public class StudentMain2 {

	public static void main(String[] args) {
		ArrayList<Student2> l = new ArrayList<>();
		Student2 s1 = new Student2("Harshita", 20);
		Student2 s2 = new Student2("Harshit", 19);
		Student2 s3 = new Student2("Harshi", 16);
		Student2 s4 = new Student2("Harsh", 23);
		Student2 s5 = new Student2("Hars", 67);
		Student2 s6 = new Student2("Har", 54);
		Student2 s7 = new Student2("Ha", 10);
		Student2 s8 = new Student2("H", 20);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		l.add(s8);
		
		Optional<Student2> o1=l.stream().min((x, y) -> {
			if (x.getAge() < y.getAge())
				return -1;
			else if (x.getAge() > y.getAge())
				return +1;
			else
				return 0;
		});
		System.out.println("Youngest Student : ");
		if(o1.isPresent())
			System.out.println(o1.get());
		
		System.out.println();
		System.out.println();
		Optional<Student2> o2=l.stream().max((x, y) -> {
			if (x.getAge() < y.getAge())
				return -1;
			else if (x.getAge() > y.getAge())
				return +1;
			else
				return 0;
		});
		System.out.println("Youngest Student : ");
		if(o2.isPresent())
			System.out.println(o2.get());
	}
}
