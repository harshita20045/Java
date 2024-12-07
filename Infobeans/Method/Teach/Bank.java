//WAP to accept deposite and withdrawl amounts amounts from user and then finally display the current balance.
import java.util.Scanner;
class Bank
{
	int ano,deposite;
	int opening_balance=1000;
	int withdrawl;
	int cur_balance=opening_balance;
	void deposite()
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Account No: ");
        ano = s.nextInt();
		System.out.println("Before deposite current balance : "+ cur_balance);
        System.out.print("Enter deposite amount: ");
        deposite = s.nextInt(); 	
		cur_balance=deposite+opening_balance;
		System.out.println("After deposite current balance : "+ cur_balance);		
	}
	void withdrawl()
	{
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account No: ");
        ano = sc.nextInt();
		System.out.println("Before withdrawl current balance : "+ cur_balance);
        System.out.print("Enter Withdrawl amount: ");
        withdrawl = sc.nextInt(); 
		if(withdrawl>cur_balance)
		{
			
		System.out.println("You cant withdrawl !");
		}	
		else{
        
		
	
		cur_balance=cur_balance-withdrawl;
		
		System.out.println("Withdrawl Succesful !");
		
		System.out.println();
		System.out.println("After withdrawl current balance : "+ cur_balance);	
		}
	}
	void show()
	{
       
		System.out.println("current balance : "+ cur_balance);
       	
	}
	public static void main(String [] args)
	{
		Scanner sm = new Scanner(System.in);
		Bank b=new Bank();
		System.out.println("Press 1 --> to show Balance ");
		System.out.println("Press 2 --> to Deposite ");
		System.out.println("Press 3 --> to Withdrawl Balance ");
		int n;
		System.out.println("Enter your choice : ");
		n=sm.nextInt();
		switch(n)
		{
			case 1: b.show();
			break;
			case 2: b.deposite();
			break;
			case 3: b.withdrawl();
			break;
			default: System.out.println("Wrong choice ");
			break;
		}
		
	}
}