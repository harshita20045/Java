/*1. Payment Gateway Interface
Objective: Create a program to simulate payment processing using different payment methods.
1.
Create an interface PaymentGateway with a method processPayment(double amount).
Implement the interface in classes CreditCardPayment and UPIPayment.
Write a driver class to test the functionality by accepting the payment method from the user and processing the payment.*/
import java.util.Scanner;
interface PaymentGateway
{
	void processPayment(double amount);
}
class CreditCardPayment implements PaymentGateway
{
	public void processPayment(double amount)
	{
		System.out.println("Processing the Payment by CreditCardPayment : "+amount);
	}
}
class UPIPayment implements PaymentGateway
{
	public void processPayment(double amount)
	{
		System.out.println("Processing the Payment by UPIPayment : "+amount);
	}
}
class Driver 
{
	public static void main(String [] args)
	{
		Scanner s =new Scanner(System.in);
		PaymentGateway p;
		System.out.println("There are two payment method : ");
		System.out.println("1 -----> CreditCardPayment ");
		System.out.println("2 -----> UPIPayment");
		System.out.print("Enter your choice : ");
		int choice=s.nextInt();
		double amount;
		
		switch(choice)
		{
			case 1: System.out.print("Enter the amount : ");
					amount=s.nextDouble();
					p=new CreditCardPayment();
					p.processPayment(amount);
			break;
			case 2:	System.out.print("Enter the amount : ");
					amount=s.nextDouble();
					p=new UPIPayment();					
					p.processPayment(amount);
			break;		
			default:System.out.print("Invalid choice");
		}
	}
}
