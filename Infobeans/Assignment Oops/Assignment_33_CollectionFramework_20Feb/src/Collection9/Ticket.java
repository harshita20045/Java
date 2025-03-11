package Collection9;
import java.util.Scanner;
import java.util.TreeSet;

public class Ticket {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number of available seat : ");
	int n=sc.nextInt();
	TreeSet<Integer> l=new TreeSet<>();
	for (int i = 0; i < n; i++) {
	      l.add(sc.nextInt());
	}
	
	System.out.print("Enter seat number to search : ");
	int s=sc.nextInt();
	 
	if(l.contains(s)) 
	{
		System.out.println(s +" is present!");
	}
	else 
	{
		System.out.println(s +" is not present!");
	}
	
	
	
}
}
