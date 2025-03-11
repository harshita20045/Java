package Collection7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

class Employee{
	private String employeeName;
	private int employeeId;
	private String employeeDepartment;
	public Employee(String employeeName, int employeeId, String employeeDepartment) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDepartment = employeeDepartment;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeDepartment="
				+ employeeDepartment + "]\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeDepartment, employeeId, employeeName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeDepartment, other.employeeDepartment) && employeeId == other.employeeId
				&& Objects.equals(employeeName, other.employeeName);
	}
	
}
public class EmployeeMain {
public static void main(String[] args) {
	Scanner scanner =new Scanner (System.in);
	HashSet<Employee> h=new HashSet<Employee>();
	System.out.print("Enter number of Employee : ");
	int size=Integer.parseInt(scanner.nextLine());
	for (int i = 0; i < size; i++) {
		System.out.println("Employee name : ");
		String name=scanner.nextLine();
		System.out.println("Employee Id : ");
	    int id=Integer.parseInt(scanner.nextLine());
		System.out.println("Employee Department : ");
		String dept=scanner.nextLine();
		
		Employee e=new Employee(name,id,dept);
		h.add(e);
		
	}
	System.out.println(h);
	}

}

