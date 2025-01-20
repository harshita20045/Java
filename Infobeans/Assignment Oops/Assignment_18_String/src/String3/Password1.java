package String3;

import java.util.Scanner;

public class Password1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Password : ");
		String a = sc.nextLine();
		int up = 0;
		int lp = 0;
		int num = 0;
		int symbol = 0;
		int space = 0;

		if (a.length() >= 8 && a.length() <= 15) {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
					up++;
				}
				if (a.charAt(i) >= 'a' && a.charAt(i) <= 'b') {
					lp++;
				}
				if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
					num++;
				}
				if (a.charAt(i) == '@' || a.charAt(i) == '*' || a.charAt(i) == '$' || a.charAt(i) == '#') {
					symbol++;
				}
				if (a.charAt(i) == ' ') {
					space++;
				}
			}
		}
		if (up >= 1 && lp >= 1 && num >= 1 && space < 1 && symbol >= 1) {
			System.out.println("Valid String");
		} else {
			System.out.println("Invalid String");
		}
	}
}
