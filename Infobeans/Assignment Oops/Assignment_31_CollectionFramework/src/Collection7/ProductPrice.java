package Collection7;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Double> t1 = new TreeSet<>();
		while (true) {
			System.out.println("Add roll number :");
			System.out.println("Display  :");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			if (choice == -1) {
				break;
			}
			switch (choice) {
			case 1:
				System.out.println();
				System.out.print("Enter a roll number : ");
				Double a = sc.nextDouble();
				t1.add(a);
				break;
			case 2:
				System.out.println("Display  : ");
				Iterator j = t1.descendingIterator();
				while (j.hasNext()) {
					System.out.println(j.next());
				}

			}

		}
	}
}
