package String4;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String result = "";
        String word = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            char c = sentence.charAt(i);
            if (c == ' ' || i == 0) {
                if (i == 0) {
                    word = c + word;
                }
                result += word + " ";
                word = "";
            } else {
                word = c + word;
            }
        }

        System.out.println("Reversed sentence: " + result.trim());
    }
}
