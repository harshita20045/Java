package Collection3;
import java.util.LinkedList;
import java.util.Scanner;
public class Library {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		LinkedList<String> l=new LinkedList<String>();
		System.out.println("Enter no. of Books : ");
		int size=Integer.parseInt(scanner.nextLine());
		for(int i=0; i<size;i++) 
		{
			l.add(scanner.nextLine());
		}
		System.out.println("Books in the inventory : ");
		for(String i:l) {
			System.out.println(i);
		}
	}

}
