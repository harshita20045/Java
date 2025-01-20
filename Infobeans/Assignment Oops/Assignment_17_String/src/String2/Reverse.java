package String2;

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=sc.nextLine();
		for (int i = s.length()-1; i >=0; i--) {
			if(s.charAt(i)!=' ') {
			System.out.print(s.charAt(i));
			}
			
		}
	}
}
