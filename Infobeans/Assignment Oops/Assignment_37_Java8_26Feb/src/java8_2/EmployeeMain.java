package java8_2;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	private int id;
	private String name;
	private int year;
	private double rating;

	public Employee(int id, String name, int year, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.rating = rating;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", year=" + year + ", rating=" + rating + "]";
	}

}

public class EmployeeMain {
	public static void main(String[] args) {

		Employee e1 = new Employee(101, "freret", 2, 4.2);
		Employee e2 = new Employee(102, "fqret", 2, 4.1);
		Employee e3 = new Employee(103, "freret", 5, 4.5);
		Employee e4 = new Employee(104, "freewr", 3, 5);
		ArrayList<Employee> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);

		Predicate<Employee> p = a -> (a.getYear() >= 3 && (a.getRating() >= 4.0 && a.getRating()<= 5.0));
		for (Employee p11 : l1) {
			if (p.test(p11)) {
				System.out.println(p11);
			}
		}

	}

}
