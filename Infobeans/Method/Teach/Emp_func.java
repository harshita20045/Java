/*1. Data members : empNo , EmpName, Basic, HRA, DA, TA, PF, loanInstallment
2. Data Functions : getEmp () to get input ( empNo, EmpName, Basic ) from user 
                              float getHRA() to return HRA as 40% 
                              float getDA() to return DA as 20%..
float getTA() to return TA as 10% of basic pay
float getPF() to return PF as 12.5% of basic pay
float getloan() to return loanInstallment as 2% of basic pay
Instructions -  store all return values from data members and get Netpay in main function
*/


import java.util.Scanner;
class 	Emp_func
{
	int emp_id;
	String emp_name;
	int basic_Salary;
	float hRA;
	float dA;
	float tA;
	float pF;
	float loanInstallment;
	float new_salary;
	void getEmp()
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Id No: ");
        emp_id = s.nextInt();
		s.nextLine();
		System.out.print("Enter name No: ");
        emp_name = s.nextLine();
		System.out.print("Enter Salary of employee : ");
		basic_Salary = s.nextInt();
       
	}
	
	float getHRA()
	{
		hRA=basic_Salary*(40.0f/100);
		return hRA;
	}
	float getDA()
	{
		dA=basic_Salary*(20.0f/100);
		return dA;
	}
	float getTA()
	{
		tA=basic_Salary*(10.0f/100);
		return tA;
	}
	float getPF()
	{
		pF=basic_Salary*(12.5f/100);
		return pF;
	}
	float getloan()
	{
		loanInstallment=basic_Salary*(2.0f/100);
		return loanInstallment;
	}
	
	public static void main(String [] args)
	{
		Scanner sm = new Scanner(System.in);
		Emp_func sa=new Emp_func();
			
		sa.getEmp();
      float  new_salary = sa.basic_Salary + sa.getHRA() + sa.getDA() + sa.getTA() - sa.getPF()-sa.getloan();
		System.out.println("Your payslip :  ");
        
		System.out.println(" -------------------------------------------------- ");
		System.out.println("  Id of Employee   : "+sa.emp_id);
		System.out.println("  Name of Employee   : "+sa.emp_name);
        System.out.println("  Basic Salary  : "+sa.basic_Salary);
		System.out.println("  House Rent Allowance added  : "+sa.getHRA());
		System.out.println("  Dearness Allowance added    : "+sa.getDA());
		System.out.println("  Travelling Allowance added  : "+sa.getTA());
		System.out.println("  Provident Fund minus        : "+sa.getPF());
		System.out.println("  LoanInstallment        : "+sa.getloan());
		System.out.println("  New Salary 				   : "+new_salary);
		System.out.println(" -------------------------------------------------- ");
		
	}
}