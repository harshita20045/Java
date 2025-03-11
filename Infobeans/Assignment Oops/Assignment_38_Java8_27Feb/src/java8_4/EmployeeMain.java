package java8_4;

import java.util.ArrayList;

class Employee
{
	private int id;
	private String name;
	private int age;
	private double salary;
	private String department;
	public Employee(int id,String name,int age,double salary,String department)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.department=department;
	}

	public int getId()
	{
		return id;
	}
	public String getName()
	{
 		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getDepartment()
	{
		return department;
	} 
	public String toString()
	{
		return id+" : "+name+" : "+age+" : "+salary+" : "+department;
	}
}

class EmployeeMain
{
	public static void main(String args[])
	{
		Employee s1=new Employee(1,"Harshita",20,90000,"IT");
		Employee s2=new Employee(2,"Arshita",29,91000,"Mangement");
		Employee s3=new Employee(3,"Mshita",18,12000,"Mangement");
		Employee s4=new Employee(4,"Shita",17,93000,"IT");
		Employee s5=new Employee(5,"Hita",26,5000,"IT");
		Employee s6=new Employee(6,"Mita",15,30005,"HR");
		Employee s7=new Employee(7,"Ta",14,60009,"HR");
		Employee s8=new Employee(8,"A",13,40000,"IT");

		ArrayList<Employee> l=new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		l.add(s8);
		
		

System.out.println("Display employees who have a salary greater than 50,000");
l.stream().filter(x->x.getSalary()>50000).forEach(w->System.out.println(w));
System.out.println();
System.out.println("Display employees who belong to the 'IT' department");
l.stream().filter(x->x.getDepartment().equals("IT")).forEach(w->System.out.println(w));
System.out.println();
System.out.println("Display employees who are older than 30 years");
l.stream().filter(x->x.getAge()>30).forEach(w->System.out.println(w));
System.out.println();
System.out.println("Display employees whose names start with 'M'");
l.stream().filter(x->x.getName().startsWith("M")).forEach(w->System.out.println(w));

	}
}