package String4;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String result = "";
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ' || i == sentence.length() - 1) {
                if (i == sentence.length() - 1) {
                    word += c;
                }
                StringBuffer sb = new StringBuffer(word);
                result += sb.reverse().toString() + " ";
                word = "";
            } else {
                word += c;
            }
        }

        System.out.println("Reversed words: " + result.trim());
    }
}

