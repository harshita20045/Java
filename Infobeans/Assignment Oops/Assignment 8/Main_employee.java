import java.util.Scanner;
class Employee 
{
    private int empId;
    private float salary;

    public Employee(int empId, float salary) 
	{
        this.empId = empId;
        this.salary = salary;
    }

    public int getEmpId() 
	{
        return empId;
    }

    public float getSalary() 
	{
        return salary;
    }
}

class EmployeeLevel extends Employee 
{
    public EmployeeLevel(int empId, float salary) 
	{
        super(empId, salary);
    }

    public int determineLevel() 
	{
       if(getSalary()>100)
	   {
		   return 1;
	   }
	   else
	   {
		   return 2;
	   }
    }

    public void display() {
        System.out.println(getEmpId());
        System.out.println(getSalary());
        System.out.println(determineLevel());
    }
}

class Main_employee
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID and salary:");
        int empId = sc.nextInt();
        float salary = sc.nextFloat();

        EmployeeLevel employee = new EmployeeLevel(empId, salary);
        employee.display();
    }
}
