package String2;
import java.util.Scanner;
public class CharacterCheck {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	       int f=0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if ((ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'z') && (ch < '0' || ch > '9')) {
	                f=1;
	                break;
	            //	f++;
	            }
	        }

	        if (f==1) {
	            System.out.println("The string contains special characters.");
	        } else {
	            System.out.println("The string does not contain any special characters.");
	        }
	        scanner.close();
	    }
}
