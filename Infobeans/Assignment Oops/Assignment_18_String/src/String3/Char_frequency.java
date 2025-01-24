package String3;
import java.util.Scanner;
public class Char_frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String a = sc.nextLine();

		for (int i = 0; i < a.length(); i++) {
			int count = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					count++;
				}
			}
			System.out.println(a.charAt(i)+" : "+count);
		}
	}
}
