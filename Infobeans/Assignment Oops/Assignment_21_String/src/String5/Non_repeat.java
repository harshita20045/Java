package String5;
import java.util.Scanner;

public class Non_repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == current) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("The first non-repeated character is: " + current);
                return;
            }
        }

        System.out.println("No non-repeated character found.");
    }
}
