package Collection13;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> h = new HashMap<>();
		while (true) {
			System.out.println("---Student Marks Management----");
			System.out.println("1. Add Employee Salary");
			System.out.println("2. Remove Employee");
			System.out.println("3. Update Salary");
			System.out.println("4. Display All Employee");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 5) {
				break;
			}

			switch (choice) {
			case 1:
				System.out.print("Enter Employee name: ");
				String name = sc.nextLine();
				System.out.print("Enter Salary:");
				double salary = Double.parseDouble(sc.nextLine());
				h.put(name, salary);
				System.out.println("Salary added successfully!");
				break;
			case 2:
				System.out.println("Remove Employee ");
				if (h.size() != 0) {
					System.out.println("Enter name : ");
					String n = sc.nextLine();
					if (h.containsKey(n)) {
						h.remove(n);
						System.out.println("Employee removed Successfully!");
					} else {
						System.out.println("Not Presented!");
					}
				} else {
					System.out.println("Empty List");
				}
				break;
			case 3:
				System.out.println("Update Salary ");
				if (h.size() != 0) {
					System.out.print("Enter name of Employee : ");
					String na = sc.nextLine();
					System.out.print("Enter salary : ");
					double sal = Double.parseDouble(sc.nextLine());
					int u = 1;
					for (Entry<String, Double> i : h.entrySet()) {
						if (i.getKey().equalsIgnoreCase(na)) {
							i.setValue(sal);
							u = 0;
						}
					}
					if (u == 1) {
						System.out.println("Salary Updated Successfully!");
					} else {
						System.out.println("Not Presented!");
					}
				} else {
					System.out.println("Empty List");
				}
				break;
			case 4:
				System.out.println("List of Employee : ");
				for (Entry<String, Double> i : h.entrySet()) {
					System.out.println(i.getKey() + " : $" + i.getValue());

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
