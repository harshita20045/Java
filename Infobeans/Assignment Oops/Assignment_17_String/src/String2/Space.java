package String2;
import java.util.Scanner;
public class Space {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=sc.nextLine();
		for (int i = 0; i <=s.length()-1; i++) {
			if(s.charAt(i)!=' ') {
			System.out.print(s.charAt(i));
			}
			
		}
	}
	
}
