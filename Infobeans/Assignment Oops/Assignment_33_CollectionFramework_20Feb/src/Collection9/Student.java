package Collection9;
import java.util.Scanner;
import java.util.TreeSet;

public class Student {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number of Student : ");
	int n=Integer.parseInt(sc.nextLine());
	TreeSet<Integer> l=new TreeSet<>();
	for (int i = 0; i < n; i++) {
	      l.add(sc.nextInt());
	}
	
	
	l.pollFirst();
	
		System.out.print(l);
	
	
}
}
