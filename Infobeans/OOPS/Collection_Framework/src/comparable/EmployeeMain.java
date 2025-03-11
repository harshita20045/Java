package comparable;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>
{

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

	@Override
	public int compareTo(Employee o) {
		if(this.id<o.id)
		{
			return -1;
		}
		else if(this.id>o.id)
		{
			return +1;
		}
		else
		{
			return 0;
		}
	}
	
}
public class EmployeeMain {
public static void main(String[] args) {
	Set<Employee> s=new TreeSet<Employee>();
	Employee e1=new Employee(109,"rashmika",9000);
	Employee e2=new Employee(102,"katappa",4000);
	Employee e3=new Employee(103,"rash",9500);
	s.add(e1);
	s.add(e2);
	s.add(e3);
	System.out.println(s);
}
	
}
