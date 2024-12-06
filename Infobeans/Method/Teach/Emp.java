import java.util.Scanner;
class Emp
{
	int em_id,sal;
	float bonus,net;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Id : ");
		em_id=sc.nextInt();
		System.out.print("Enter Salary : ");
		sal=sc.nextInt();
	}
	void process()
	{
		bonus=sal*(20.0f/100);
		net=sal+bonus;
	}
	void putdata()
	{		
		System.out.println("Employee Id : "+em_id);
		System.out.println("Before bonus Salary : "+sal);
		System.out.println("bonus is : "+bonus+" %");
		System.out.println("After bonus Salary : "+net);
	}
	public static void main(String [] args)
	{
		Emp e1=new Emp();
		e1.getdata();
		e1.process();
		e1.putdata();
	}
}