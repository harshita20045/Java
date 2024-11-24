import java.util.Scanner;
 class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
       
        System.out.print("Enter number 1: ");
        int num = scanner.nextInt();
        int sum = num;
        int max = num;
        int min = num;

        
        for (int i = 1; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num = scanner.nextInt();

            
            sum += num;

           
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Calculate the average
        double average = (double) sum / n;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);

       
    }
}