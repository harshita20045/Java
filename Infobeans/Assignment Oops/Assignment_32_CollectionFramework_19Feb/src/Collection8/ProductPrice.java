package Collection8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
class Sort implements Comparator<Double>
{
	public int compare(Double i1,Double i2) {
		if(i1<i2)
		{
			return +1;
		}
		else if(i1>i2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
public class ProductPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Double> t1 = new TreeSet<>(new Sort());
		while (true) {
			System.out.println("Add Product Price :");
			System.out.println("Display  :");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			if (choice == -1) {
				break;
			}
			switch (choice) {
			case 1:
				System.out.println();
				System.out.print("Enter a Product Price : ");
				Double a = sc.nextDouble();
				t1.add(a);
				break;
			case 2:
				System.out.println("Display  : ");
				Iterator j = t1.iterator();
				while (j.hasNext()) {
					System.out.println(j.next());
				}

			}

		}
	}
}
