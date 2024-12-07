//WAP to to accept employee detailts to process his payslip as 
// Empid: Basic Salary : HRA(40% of basic salary): DA(20%): TA(10%): PF(12.5% of basic salary):
//new salary = basic + HRA + DA + TA - PF;
import java.util.Scanner;
class Salary
{
	int emp_id;
	int basic_Salary;
	float hRA;
	float dA;
	float tA;
	float pF;
	float new_salary;
	void getdata()
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Id No: ");
        emp_id = s.nextInt();
		System.out.println("Enter Salary of employee : ");
		basic_Salary = s.nextInt();
        process();
		show();
	}
	void process()
	{
		hRA=basic_Salary*(40.0f/100);
		dA=basic_Salary*(20.0f/100);
		tA=basic_Salary*(10.0f/100);
		pF=basic_Salary*(12.5f/100);
		new_salary = basic_Salary + hRA + dA + tA - pF;
	}
	void show()
	{
        
		System.out.println("Your payslip :  ");
        
		System.out.println(" -------------------------------------------------- ");
        System.out.println("|  Basic Salary  : "+basic_Salary+"\t                    |");
		System.out.println("|  House Rent Allowance added  : "+hRA+"             |");
		System.out.println("|  Dearness Allowance added    : "+dA+"             |");
		System.out.println("|  Travelling Allowance added  : "+tA+"             |");
		System.out.println("|  Provident Fund minus        : "+pF+"             |");
		System.out.println("|                                                   |");
		System.out.println("|  New Salary 				   : "+new_salary+"|");
		System.out.println(" -------------------------------------------------- ");
	}
	public static void main(String [] args)
	{
		Scanner sm = new Scanner(System.in);
		Salary sa=new Salary();
		sa.getdata();
		
	}
}