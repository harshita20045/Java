package String5;
import java.util.Scanner;
public class Replace {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        StringBuffer a=new StringBuffer(s);
        for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)=='a') {
				a.replace(i,i+1,"o");
				
			}
		}
        System.out.println(a);
	}
}
