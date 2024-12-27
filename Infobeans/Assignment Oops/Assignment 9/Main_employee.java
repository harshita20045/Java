/*Assignment 5:
Create a parent class Employee with a method calculateSalary() that prints "Base salary calculation for Employee."
Create subclasses:
Manager that overrides calculateSalary() to add a bonus to the base salary.
Developer that overrides calculateSalary() to calculate salary based on hours worked.
Demonstrate the overridden method in the Main class by creating an array of Employee objects and calling calculateSalary() on each.*/

class Employee 
{
    void calculateSalary() 
	{
        System.out.println("Base salary calculation for Employee.");
    }
}

class Manager extends Employee 
{
    void calculateSalary() 
	{
        double s = 50000; 
        double b = 1000;      
        System.out.println("Manager's salary: " + (s + b));
    }
}

class Developer extends Employee 
{
    void calculateSalary() {
        double perhour = 50;   
        int h = 12;    
        System.out.println("Developer's salary: " + (perhour * h));
    }
}

public class Main_employee 
{
    public static void main(String[] args) 
	{
        Employee[] e = new Employee[3];
        e[0] = new Employee(); 
        e[1] = new Manager();  
        e[2] = new Developer(); 

        for (Employee x : e) 
		{
            x.calculateSalary(); 
        }
    }
}
