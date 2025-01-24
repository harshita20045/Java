package Exception1;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers separated by space: ");
        String input = sc.nextLine();

        try {
            String[] parts = input.split(" ");
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[1]);

            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input. Please enter two integers.");
        }
    }
}
