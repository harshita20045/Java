package java8_2;

import java.util.Scanner;
import java.util.function.Predicate;

public class Email {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Predicate<String> p=s->s.contains("@")&&s.endsWith(".com");
		
	System.out.print("Enter email : ");
	String s=sc.nextLine();
			System.out.println(p.test(s));
	
}
}
