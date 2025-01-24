package String5;

import java.util.Scanner;

public class RemoveNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < '0' || a.charAt(i) > '9') {
                result.append(a.charAt(i));
            }
        }

        System.out.println("Modified String: " + result);
    }
}
