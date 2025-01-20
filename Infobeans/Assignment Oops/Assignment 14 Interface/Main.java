interface Calculator 
{
    
    static int add(int a, int b)
	{
        return a + b;
    }

    default int subtract(int a, int b)
	{
        return a - b;
    }
}


class BasicCalculator implements Calculator 
{
   
}

public class Main {
    public static void main(String[] args) {
       
        int sum = Calculator.add(10, 5);
        System.out.println("Sum: " + sum);

       
        BasicCalculator calc = new BasicCalculator();
        int difference = calc.subtract(10, 5);
        System.out.println("Difference: " + difference);
    }
}
