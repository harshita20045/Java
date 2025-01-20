import java.util.Scanner;

interface Principal 
{
    double getPrincipal();
}

interface InterestRate 
{
    double getRate();
}

class Loan implements Principal, InterestRate 
{
    private double principal;
    private double rate;

    public Loan(double principal, double rate) 
	{
        this.principal = principal;
        this.rate = rate;
    }

    public double getPrincipal()
	{
        return principal;
    }

    public double getRate() 
	{
        return rate;
    }

    public double calculateInterest(int years) 
	{
        return principal * rate * years;
    }
}

public class CarLoanCalculator 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        int years = sc.nextInt();

        if (principal <= 0 || rate <= 0 || years <= 0 || principal >= 1000000 || rate > 0.99 || years >= 25) 
		{
            System.out.println("Invalid input values!");
        } else 
		{
            Loan loan = new Loan(principal, rate);
            double totalInterest = loan.calculateInterest(years);
            System.out.printf("Total interest paid: Rs.%.2f%n", totalInterest);
        }
    }
}
