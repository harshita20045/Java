import java.util.Scanner;
class Person 
{
    private String firstName;
    private String lastName;
	public Person(String firstName, String lastName) 
	{
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() 
	{
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) 
	{
        this.lastName = lastName;
    }
}

class Employee extends Person 
{
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) 
	{
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() 
	{
        return employeeId;
    }

    public void setEmployeeId(int employeeId) 
	{
        this.employeeId = employeeId;
    }

    public String getJobTitle() 
	{
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) 
	{
        this.jobTitle = jobTitle;
    }

    public void display() 
	{
		System.out.println();
        System.out.println("Employee details:");
        System.out.println("Name: " + getFirstName() + " " + getLastName() + ", " + jobTitle);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Main 
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first name:");
        String firstName = s.nextLine();

        System.out.print("Enter last name:");
        String lastName = s.nextLine();

        System.out.print("Enter employee ID:");
        int employeeId = Integer.parseInt(s.nextLine());

        System.out.print("Enter job title:");
        String jobTitle = s.nextLine();

        
        Employee e1 = new Employee(firstName, lastName, employeeId, jobTitle);
        e1.display();
    }
}
