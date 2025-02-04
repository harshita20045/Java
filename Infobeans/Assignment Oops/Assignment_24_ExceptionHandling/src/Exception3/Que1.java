/*QNo 4:
1. Bank Account Management
Objective: Create a program to manage bank accounts and handle exceptions for insufficient balance and negative deposit amounts.

Details:
Create a BankAccount class with fields for accountNumber, accountHolder, and balance.
Define two custom exceptions:
InsufficientBalanceException for withdrawal amounts exceeding the balance.
NegativeDepositException for deposits with negative amounts.
Include methods for deposit(double amount) and withdraw(double amount) that throw the respective exceptions.
In the main method, demonstrate various cases like successful transactions, insufficient balance, and invalid deposits.
 */
package Exception3;
import java.util.Scanner;
class InsufficientBalanceException extends RuntimeException{

	 InsufficientBalanceException(String str) {
		super(str);
	}
	
}
class NegativeDepositException extends RuntimeException{

	 NegativeDepositException(String str) {
		super(str);
	}
	
}
class BankAccount{
	int accountNumber;
	String accountHolder;
	float balance;
	
	void deposit(double amount) {
		try {
		if(amount<0) {
			throw new NegativeDepositException("Enter positive Amount");
		}
		else {
			System.out.println("successful withdrawl");
		}
		}
		catch(NegativeDepositException e) {
			System.out.println(e.getMessage());
		}
	}
	void withdrawl(double amount) {
		try {
		if(balance<amount) {
			throw new InsufficientBalanceException("InsufficientBalanceException for withdrawal amounts exceeding the balance");
		}
		else {
			System.out.println("successful deposit");
		}
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Que1 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a Account Number : ");
		int accountNumber=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter a Account Holder Name : ");
		String accountHolder=scanner.nextLine();
		System.out.println("Enter a Balance : ");
		float balance=scanner.nextFloat();
		BankAccount b1=new BankAccount();
		System.out.println("What you want to do ? ");
		System.out.println("1 ------> Deposite ");
		System.out.println("2 ------> Withdrawl ");
		System.out.println("Enter your choice :  ");
		int a=scanner.nextInt();
		int amount=0;
		switch(a) {
		case 1:System.out.println("Enter amount : ");
				 amount = scanner.nextInt();
				 b1.deposit(amount);
		break;
				 
		case 2:System.out.println("Enter amount : ");
		      amount = scanner.nextInt();
		      b1.withdrawl(amount);
		}
		

		
		
	}
}
