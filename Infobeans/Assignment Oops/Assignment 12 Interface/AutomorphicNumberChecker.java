import java.util.Scanner;

interface NumberInput 
{
    int getInput();
}

interface AutomorphicChecker 
{
    boolean isAutomorphic(int number);
}

class AutomorphicNumber implements NumberInput, AutomorphicChecker 
{
    public int getInput() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }


    public boolean isAutomorphic(int number) 
	{
        int square = number * number;
        int temp = number; 

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false; 
            }
            temp /= 10; 
            square /= 10; 
        }

        return true; 
    }
}

public class AutomorphicNumberChecker 
{
    public static void main(String[] args)
	{
        AutomorphicNumber automorphic = new AutomorphicNumber();
        int n = automorphic.getInput();

        if (automorphic.isAutomorphic(n)) 
		{
            System.out.println(n + " is an automorphic number");
        } else 
		{
            System.out.println(n + " is not an automorphic number");
        }
    }
}
