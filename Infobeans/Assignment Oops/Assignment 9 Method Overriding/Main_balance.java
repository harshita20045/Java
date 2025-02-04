/*Assignment 3.
Create a parent class Bank with a method getInterestRate() that returns 0.
Create subclasses:
SBI that overrides getInterestRate() to return 5.
ICICI that overrides getInterestRate() to return 6.
Axis that overrides getInterestRate() to return 7.
In the Main class, demonstrate method overriding by calling getInterestRate() on different bank objects.
*/
class Bank 
{
    int getInterestRate() 
	{
        return 0; 
    }
}

class SBI extends Bank 
{
    int getInterestRate() 
	{
        return 5; 
    }
}

class ICICI extends Bank {
   
    int getInterestRate() {
        return 6; // Specific interest rate for ICICI
    }
}

class Axis extends Bank 
{
   
    int getInterestRate() 
	{
        return 7; 
    }
}

class Main_bank 
{
    public static void main(String[] args) 
	{
        Bank b1 = new SBI();    
        Bank b2 = new ICICI(); 
        Bank b3 = new Axis();  

        System.out.println("SBI Interest Rate: " + b1.getInterestRate());
        System.out.println("ICICI Interest Rate: " + b2.getInterestRate());
        System.out.println("Axis Interest Rate: " + b3.getInterestRate());
    }
}
