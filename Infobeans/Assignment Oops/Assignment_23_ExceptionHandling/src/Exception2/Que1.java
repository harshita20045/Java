package Exception2;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			
			try {
				System.out.println(a/b);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
				
			
	}
}
