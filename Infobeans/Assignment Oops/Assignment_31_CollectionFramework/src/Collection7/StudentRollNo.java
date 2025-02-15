package Collection7;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentRollNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> t1 = new TreeSet<>();
		while (true) {
			System.out.println("Add roll number :");
			System.out.println("Display  :");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter a roll number : ");
				int a = sc.nextInt();
				t1.add(a);
				break;
			case 2:
				System.out.print("Display  : ");
				for (Integer i : t1) {
					System.out.println(i);
				}

			}

		}
	}
}
