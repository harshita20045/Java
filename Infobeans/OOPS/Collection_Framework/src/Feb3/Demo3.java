package Feb3;

import java.util.ArrayList;
import java.util.List;

class Employee{
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
public class Demo3 {
public static void main(String[] args) {
	Employee e1=new Employee(101,"abc",9000);
	Employee e2=new Employee(102,"xyz",76000);
	Employee e3=new Employee(103,"www",5400);
	List<Employee> l=new ArrayList<Employee>();
	l.add(e1);
	l.add(e2);
	l.add(e3);
	// System.out.println(l);  ------> hash code
	System.out.println();
	for(Employee e :l) {
	//	System.out.println(e);  ------->giving hash code so override toString()
		System.out.println(e);
	}
}
}
