/*3. Library Management System
Objective: Manage library operations using an interface.

Define an interface LibraryOperations with methods issueBook() and returnBook().
Implement the interface in Student and Teacher classes.
Demonstrate how students and teachers interact with the library differently.*/
import java.util.Scanner;
interface LibraryOperations
{
	void issueBook();
	void returnBook();
}
class Student implements LibraryOperations
{
	public void issueBook()
	{
		System.out.println("Book issued for Student");
	}
	public void returnBook()
	{
		System.out.println("Book returned from Student");
	}
	
}
class Teacher implements LibraryOperations
{
	public void issueBook()
	{
		System.out.println("Book issued for Teacher");
	}
	public void returnBook()
	{
		System.out.println("Book Returned from Teacher");
	}
}
class LibraryManagementSystem
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		LibraryOperations l=null;
		System.out.println("Select user type:");
		System.out.println("1. Student");
		System.out.println("2. Teacher");
		System.out.print("Enter user type : ");
		int u=sc.nextInt();
		int f=1;
		switch(u)
		{
			case 1: l = new Student();
				   f=0;
			break;
			case 2: l = new Teacher();
			       f=0;
			break;
			default : System.out.println("Invalid choice");
			break;
		}
		if(f==0)
		{
			System.out.println("What you want to do ");
			System.out.println("1. Issue Book");
			System.out.println("2. Return Book");
			System.out.print("Enter user choice : ");
			int c=sc.nextInt();
			switch(c)
			{
				case 1:l.issueBook();
				break;
				case 2:l.returnBook();
				break;
				default:System.out.println("Invalid choice");		
			}
		}
		
	}
}