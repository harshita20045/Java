package Exception2;
import java.util.*;
import java.util.Scanner;
public class Que3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	        	 int a = scanner.nextInt();
		            System.out.println(a);
			} catch (InputMismatchException e) {
				System.out.println(e);
			}
	           
	       
	    }
}


