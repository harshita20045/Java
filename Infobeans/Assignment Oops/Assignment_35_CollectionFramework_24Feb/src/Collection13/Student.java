package Collection13;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<>();
		while (true) {
			System.out.println("---Student Marks Management----");
			System.out.println("1. Add Student Marks");
			System.out.println("2. Remove Student");
			System.out.println("3. Update Marks");
			System.out.println("4. Display All Students");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 5) {
				break;
			}

			switch (choice) {
			case 1:
				System.out.print("Enter student name: ");
				String name = sc.nextLine();
				System.out.print("Enter marks:");
				int marks = Integer.parseInt(sc.nextLine());
				h.put(name, marks);
				System.out.println("Marks added successfully!");
				break;
			case 2:
				System.out.println("Remove Student ");
				if (h.size() != 0) {
					System.out.println("Enter name : ");
					String n = sc.nextLine();
					if (h.containsKey(n)) {
						h.remove(n);
					} else {
						System.out.println("Not Presented!");
					}
				} else {
					System.out.println("Empty List");
				}
				break;
			case 3:
				System.out.println("Update Marks ");
				if (h.size() != 0) {
					System.out.print("Enter name of Student : ");
					String na = sc.nextLine();
					System.out.print("Enter marks : ");
					int mark = Integer.parseInt(sc.nextLine());
					int u = 1;
					for (Entry<String, Integer> i : h.entrySet()) {
						if (i.getKey().equalsIgnoreCase(na)) {
							i.setValue(mark);
							u = 0;
						}
					}
					if (u == 1) {
						System.out.println("Updated Successfully!");
					} else {
						System.out.println("Not Presented!");
					}
				} else {
					System.out.println("Empty List");
				}
				break;
			case 4:
				System.out.println("List of Student : ");
				for (Entry<String, Integer> i : h.entrySet()) {
					System.out.println(i.getKey() + " : " + i.getValue());

				}
				break;

			default:
				System.out.println("Invalid Choice ! ");
				break;

			}

		}
		System.out.println("THANK YOU FOR VISITING");
	}

}
