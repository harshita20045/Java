package String4;

import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();
		int count=0;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {

				for (int j = 0; j < str2.length(); j++) {
					if(str1.charAt(i)==str2.charAt(j)) 
					{
						count++;
					}
				}
			}
			if(count==str1.length()) 
			{
				System.out.println("Yes");
			}
			else 
			{
				System.out.println("No");
			}
		}

	}
}

