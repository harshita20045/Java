import java.util.Scanner;

public class Square{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

       
        System.out.println("Squares of the first " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.println("Square of " + i + " 	: " + square);
        }
        
        
    }
}