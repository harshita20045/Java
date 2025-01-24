package String4;
import java.util.Scanner;
public class Ascii {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=scanner.nextLine();
		for (int i = 0; i < s.length(); i++) {
			System.out.print((int)s.charAt(i)+ " ");
		}
	}
}
