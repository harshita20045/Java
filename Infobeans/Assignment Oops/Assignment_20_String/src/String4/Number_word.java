package String4;

import java.util.Scanner;

public class Number_word {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String s = scanner.nextLine();

		String[] words = s.split(" ");
		System.out.println("Number of words: " + words.length);
	}
}
