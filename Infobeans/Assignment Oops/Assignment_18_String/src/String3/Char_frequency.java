package String3;

import java.util.Scanner;

public class Char_frequency {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (c == input.charAt(j)) count++;
            }
            System.out.println(c + " = " + count);
        }
    }
}
