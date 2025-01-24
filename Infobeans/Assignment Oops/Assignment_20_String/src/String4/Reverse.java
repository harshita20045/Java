package String4;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String a = scanner.nextLine();
		String[] arr = a.split(" ");

		for (int i = 1; i < arr.length; i += 2) {
			StringBuffer reverse_word = new StringBuffer(arr[i]);
			reverse_word.reverse();
			arr[i] = reverse_word.toString();
		}
		StringBuffer last = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			last.append(arr[i]);
			last.append(" ");

		}
		System.out.println(last);
	}
}

