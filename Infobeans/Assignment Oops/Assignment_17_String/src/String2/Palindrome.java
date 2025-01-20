package String2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=sc.nextLine();
		int f=0;
		for (int i = 0; i<s.length(); i++) {
			if(s.charAt(i)==s.charAt(s.length()-(i+1))) 
			{
				f=0;			
			}
			else 
			{
				f=1;
				break;
			}
		}
		if (f==0) {
			System.out.println("Yes, it's a palindrome.");
			
		} 
		else {
			System.out.println("No, it's not a palindrome.");
		}
		
	}
}
