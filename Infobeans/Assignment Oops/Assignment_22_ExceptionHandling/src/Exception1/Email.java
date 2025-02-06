package Exception1;

import java.util.Scanner;

class InvalidDotException extends RuntimeException{
	public  InvalidDotException(String str) {
		super(str);
	}
}
class InvalidAtTheRateException extends RuntimeException{
	public  InvalidAtTheRateException(String str) {
		super(str);
	}
}
class InvalidDomainException extends RuntimeException{
	public  InvalidDomainException(String str) {
		super(str);
	}
}
public class Email {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter email :");
	String s=sc.nextLine();
	
	try {
		
		if(!s.contains(".")) {
			
			throw new InvalidDotException("Dot must be included");
			
		}
		if(!(s.contains("@"))) {
			throw new InvalidAtTheRateException("@ must be included");
		}
		if(!(s.endsWith("com")||s.endsWith("in")||s.endsWith("biz")||s.endsWith("net")))                 {
			throw new InvalidDomainException("domain must be include in end");
		}
		
		System.out.println("Valid email address");
	}catch(InvalidDotException e) {
		System.out.println(e.getMessage());
		System.out.println("Invalid email address");
	}catch(InvalidAtTheRateException e) {
		System.out.println(e.getMessage());
		System.out.println("Invalid email address");
	}catch(InvalidDomainException e) {
		System.out.println(e.getMessage());
		System.out.println("Invalid email address");
	}
	
	
}
}
