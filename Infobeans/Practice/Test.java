import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Program 1: Print the series 1/1^1 + 1/2^2 + ... + 1/n along with its sum
        System.out.println("1. Write a program to print the series 1/1^1 + 1/2^2 + 1/3^3...…. + 1/n along with its sum");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        double sum4 = 1.0;
        System.out.print("1/1^1 ");
        for (int i = 2; i <= n; i++) {
            System.out.print("+ 1/" + i + "^" + i + " ");
            int sq = 1;
            for (int j = 1; j <= i; j++) {
                sq *= i;
            }
            sum4 += (1.0 / sq);
        }
        System.out.println();
        System.out.println("Sum: " + sum4);

        System.out.println("\n");

        // Program 2: Find the largest number from n inputs
        System.out.println("2. Write a program to print the Largest Number");
        System.out.print("Enter how many numbers you want to compare: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 1st number: ");
        int max = sc.nextInt();
        for (int i = 2; i <= n1; i++) {
            System.out.print("Enter " + i + "th number: ");
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum: " + max);

        System.out.println("\n");

        // Program 3: Print tables for a range of numbers
        System.out.println("3. Write a program to print Table");
        System.out.print("Enter the start number: ");
        int t1 = sc.nextInt();
        System.out.print("Enter the end number: ");
        int t2 = sc.nextInt();
        for (int i = t1; i <= t2; i++) {
            System.out.println("Table of " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

        System.out.println("\n");

        // Program 4: Calculate total bill for multiple items
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        int choice;

        do {
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();

            System.out.print("Enter item price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter item quantity: ");
            int quantity = scanner.nextInt();

            double itemTotal = price * quantity;
            total += itemTotal;

            System.out.printf("Item Total: %.2f\n", itemTotal);

            System.out.print("Do you want to add more items? (1 for yes, 0 for no): ");
            choice = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character
        } while (choice == 1);

        System.out.printf("\nTotal Bill Amount: %.2f\n", total);

        sc.close();
        scanner.close();
    }
}
