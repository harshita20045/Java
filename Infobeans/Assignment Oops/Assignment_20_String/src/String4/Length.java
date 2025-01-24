package String4;
import java.util.Scanner;
public class Length {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = scanner.nextLine();

	        char a[]=s.toCharArray();
	        int count=0;
	        for (char c : s.toCharArray()) {
	            count++;
	        }
	        System.out.println("Length of the string: " + count);
	    }
	}


