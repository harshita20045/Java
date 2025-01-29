package Exception2;

import java.util.Scanner;

public class Que2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int number =s.nextInt();
	try {
	 if (number == 0) {
         throw new ArithmeticException("Number cannot be zero");
     } else if (number > 7) {
         throw new IllegalArgumentException("Number should not be greater than 7");
     } else {
         System.out.println(number);
     }
 } catch (ArithmeticException e) {
     System.out.println("ArithmeticException caught - " + e);
 } catch (IllegalArgumentException e) {
     System.out.println("IllegalArgumentException caught - " + e);
 }
}
}
