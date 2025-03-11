package java8_2;

import java.util.Scanner;
import java.util.function.Predicate;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Predicate<String> p=s->{
		
		StringBuffer r=new StringBuffer(s);
		return r.toString().equals(s);
		
	};
	System.out.println(p.test("kanak"));
}
}
