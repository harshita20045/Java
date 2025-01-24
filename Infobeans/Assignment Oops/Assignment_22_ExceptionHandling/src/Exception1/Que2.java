package Exception1;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = "";
        
        do {
            System.out.println("Enter two numbers : ");
            
            try {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int result = num1 / num2;
                System.out.println("Result: " + result);

                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers only.");
                sc.nextLine();
            }
            
            System.out.println("If you want to quit enter --> exit ");
            ch = sc.nextLine();

        } while (!ch.equals("exit"));

        System.out.println("Goodbye!");
    }
}
