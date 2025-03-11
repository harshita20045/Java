package java8_1;

interface PalindromeChecker{
	
	public void isPalindrome(StringBuffer string);
}
public class Palindrome {

	public static void main(String[] args) {
		PalindromeChecker p1=s-> {
			StringBuffer r=s.reverse();
			if(s.equals(r)) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			
			
		};
		StringBuffer r=new StringBuffer("kanak");
		p1.isPalindrome(r);
	}
}
