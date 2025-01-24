package String5;

import java.util.Scanner;

public class Short {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String shortestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }

        System.out.println("Shortest word: " + shortestWord);
    }
}
