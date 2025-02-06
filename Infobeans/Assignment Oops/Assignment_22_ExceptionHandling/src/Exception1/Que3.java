package Exception1;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers separated by space: ");
        

        try {
           
            int num1 = Integer.parseInt(sc.nextLine());
            int num2 = Integer.parseInt( sc.nextLine());

            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NumberFormatException  e) {
            System.out.println("Invalid input. Please enter two integers.");
        }
    }
}
