/*Create a class named Bank Account with attributes:
accountNumber (String)
account HolderName (String)
balance (double)
Implement the following:
A default constructor that initializes all attributes to default values.
A parameterized constructor to initialize all attributes.
A copy constructor to create a duplicate account with the same details. Write a displayAccountDetails() method to show the account's details.
In the main method:
Create an object using the parameterized constructor.
Create a duplicate object using the copy constructor.
Modify the balance of the duplicate account and display the details of both accounts to show they are independent.*/
class Account
{
	private String  accountNumber;
	private String accountHolderName;
	private double balance;
	
	Account()
	{
		accountNumber="21424PN3425";
		accountHolderName="Harshita Baghel";
		balance=100000;
	}
	
	Account(String accountNumber,String accountHolderName,double balance)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	Account(Account a)
	{
		this.accountNumber=a.accountNumber;
		this.accountHolderName=a.accountHolderName;
		this.balance=a.balance;
	}
	void setBalance()
	{
		balance=43366;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("Account number : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Account balance : "+balance);
	}
	
}
class Bank
{
	public static void main(String args[])
	{
		Account a1=new Account();
		a1.display();
		Account a2=new Account("2343090jkj3243","Shivraj",20000);
		a2.display();
		Account a3=new Account(a2);
		a3.display();
		a3.setBalance();
		a3.display();
		
	}
}