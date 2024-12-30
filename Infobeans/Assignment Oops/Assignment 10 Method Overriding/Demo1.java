/*1. Problem Statement
Teena's retail store has implemented a Loyalty Points System to reward customers based on their spending. The program includes two classes: Customer and PremiumCustomer.

For regular customers: Loyalty points = amount spent / 10
For premium customers: Loyalty points = 2 * (amount spent / 10)

Calculate and display the loyal points received by the customers using an overridden method calculateLoyaltyPoints.
Input format :
The first line of input consists of an integer representing the amount spent by the customer.
The second line consists of premium customer status (a string) - "yes" if the customer is a premium customer, "no" if they are not.
Output format :
The output displays the loyalty points earned based on the amount spent.

Refer to the sample output for formatting specifications.
Code constraints :
1 ≤ amount ≤ 10,000
Sample test cases :
Input 1 :
50
yes
Output 1 :
10
Input 2 :
40
no
Output 2 :
4
*/
import java.util.Scanner;
class Customer
{
	int amount;
	double loyality_point;

	double calculateLoyaltyPoints(int amount)
	{
		loyality_point = amount/ 10;
		return loyality_point;
	}
}

class PremiumCustomer extends Customer
{
	double calculateLoyaltyPoints(int amount)
	{
		loyality_point = 2 * (amount/ 10);
		return loyality_point;
	}
}
class Demo1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a;
		String b;
		System.out.println("Enter Amount");
		a=s.nextInt();
		s.nextLine();
		System.out.println("Are you a Premium Customer : ");
		b=s.nextLine();
		Customer c1;
		if(b.equals("no"))
		{
			c1=new Customer();
			System.out.println(c1.calculateLoyaltyPoints(a));
		}
		else if(b.equals("yes"))
		{
			c1=new PremiumCustomer();
			System.out.println(c1.calculateLoyaltyPoints(a));
		}
		else
		{
			System.out.println("Wrong input");
		}
	}
}