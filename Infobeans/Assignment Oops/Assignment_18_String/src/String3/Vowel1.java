package String3;

import java.util.Scanner;

public class Vowel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + " ";
        }

        System.out.println(result.trim());
    }
}
