/* 
WAP to store employe details :
Employe no, Employe Name , dept , days present , perday pay,monthy salary
data member : 
void on Borad Employe(employe name , dept)
float calculate() :- to retune monthy salary
float process () :- to return per day pay {maketing , sales , production}
void display () - to show all details 
*/

import java.util.Scanner;
class Emp_12
{
	Scanner s=new Scanner(System.in);
	int emp_no,days_present,flag=0;
	float perday_pay,monthly_salary;
	String emp_name,dept;
	void onBoard()
	{
		
		System.out.println("Enter Employee details : ");
		System.out.println();		
		System.out.print("Enter Employee Id : ");
		emp_no=s.nextInt();
		s.nextLine();
		System.out.print("Enter Employee Name : ");
		emp_name=s.nextLine();
		System.out.print("Enter Department : ");
		dept=s.nextLine();
		System.out.print("Enter Daypresent : ");
		days_present=s.nextInt();
		
	}
	float process()
	{
		if(dept.equals("Marketing"))
		{
			perday_pay=500;
			System.out.println("Congrates ! ");
		}
		else if(dept.equals("Sales"))
		{
			perday_pay=600;
			System.out.println("Congrates ! ");
		}
		else if(dept.equals("Production"))
		{
			perday_pay=400;
			System.out.println("Congrates ! ");
		}
		else
		{
			flag=1;
			System.out.print("Not Congrates ! ");	
			
		}
		return perday_pay;
			
	}
	float calculate()
	{				
		monthly_salary=days_present*process();
	    return monthly_salary;
	}
	void display()
	{		
	   
		
		System.out.println();	
		System.out.println("Employee Id : "+emp_no);
		System.out.println("Employee Name : "+emp_name);
		System.out.println("Employee Department : "+dept);
		System.out.println("Day Present : "+days_present);
		System.out.println("Per Day Pay : "+perday_pay);
		System.out.println("Monthly Pay : "+monthly_salary);
	}
	public static void main(String [] args)
	{
		Emp_12 e=new Emp_12();
		e.onBoard();
		e.calculate();         
		if(e.flag==1)
		{
			System.out.println("Oops,You are not On Boarded \n May be you have Entered Wrong Department");
		}
		else{
		e.display();
		}
	}
}