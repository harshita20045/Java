package java8_3;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "rger", 4534);
		Employee e2 = new Employee(2, "rgerdfg", 3490);
		Employee e3 = new Employee(3, "rgerer", 65734);
		Employee e4 = new Employee(4, "rgewrer", 56634);
		ArrayList<Employee> l = new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);

		Predicate<Employee> p = a -> a.getSalary() < 50000;

		Function<Employee, Employee> f = c -> {
			c.setSalary((c.getSalary() / 10) + c.getSalary());
			return c;
		};
		for (Employee e : l) {
			if (p.test(e)) {
				f.apply(e);
			}
		}

		for (Employee e : l) {
			System.out.println(e);
		}

	}
}
