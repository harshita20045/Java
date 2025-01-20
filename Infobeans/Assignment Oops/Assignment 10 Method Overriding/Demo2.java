/*2.Problem Statement
Rithish is developing a straightforward pizza ordering system. To achieve this, he needs a Pizza class with a constructor for the base price and topping cost, along with a calculatePrice method overriding. He also wants a DiscountedPizza class that inherits from Pizza, applying a 10% discount for more than three toppings.
The program prompts the user for inputs, creates instances of both classes, calculates regular and discounted prices, and displays them formatted appropriately.
Example 1

Input:
9.5
1.25
3
Output: 
Price without discount: Rs.13.25
Price with discount: Rs.13.25
Explanation:
Rithish orders a pizza with a base price of Rs. 9.5, a topping cost of Rs. 1.25, and selects 3 toppings. The price is calculated as 9.5 + (1.25 * 3) = 13.25. The regular and discounted prices are both Rs. 13.25, as no discount has been applied.

Example 2
Input:
11.0
2.0
7
Output: 
Price without discount: Rs.25.00
Price with discount: Rs.22.50
Explanation:
Rithish orders another pizza with a higher base price of Rs. 11.0, a topping cost of Rs. 2.0, and chooses 7 toppings. 
Regular Price: 11.0 + (2.0 * 7) = Rs. 25.00.
Discounted Price: The discounted price is calculated as 90% of the regular price, i.e., 0.9 * 25.00 = Rs.22.50. 
Input format :
The first line of input consists of a double value, representing the base price of the pizza.
The second line consists of a double value, representing the cost per topping.
The third line consists of an integer, representing the number of toppings chosen for the pizza.
Output format :
The first line of output prints the price without discount, rounded off to two decimal places.
The second line prints the price with the discount, rounded off to two decimal places.

Refer to the sample output for formatting specifications.
Code constraints :
The base price and the cost per topping should be greater than zero.
1 ≤ number of toppings ≤ 10
Sample test cases :
Input 1 :
9.5
1.25
3
Output 1 :
Price without discount: Rs.13.25
Price with discount: Rs.13.25
Input 2 :
11.0
2.0
7
Output 2 :
Price without discount: Rs.25.00
Price with discount: Rs.2
*/
import java.util.Scanner;

class Pizza 
{
    double price, topping_cost;
    int nt;

    Pizza(double price, double topping_cost, int nt) 
	{
        this.price = price;
        this.topping_cost = topping_cost;
        this.nt = nt;
    }

    double calculatePrice() 
	{
        return price + (topping_cost * nt);
    }
}

class DiscountedPizza extends Pizza 
{
    DiscountedPizza(double price, double topping_cost, int nt) 
	{
        super(price, topping_cost, nt);
    }

    double calculatePrice() 
	{
        double totalPrice = super.calculatePrice();
        if (nt > 3) 
		{
            return totalPrice-totalPrice * (0.1); 
        }
		else 
		{
            return totalPrice; 
        }
    }
}

class Demo2 
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);

        System.out.print("Enter base price of pizza:");
        double price = s.nextDouble();

        System.out.print("Enter topping cost per item:");
        double topping_cost = s.nextDouble();

        System.out.print("Enter number of toppings:");
        int nt = s.nextInt();
        Pizza p1 = new Pizza(price, topping_cost, nt);
        DiscountedPizza p2 = new DiscountedPizza(price, topping_cost, nt);
		System.out.printf("Price without discount: Rs.%.2f%n", p1.calculatePrice());
        System.out.printf("Price with discount: Rs.%.2f%n", p2.calculatePrice());

    }
}

