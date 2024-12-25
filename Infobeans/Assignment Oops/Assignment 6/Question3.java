import java.util.Scanner;
class Question3
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int temp = n;
        int sum = 0;

        while (n!=0) {
            int rem = n % 10;
            int mul = 1;

            for (int i = 1; i <= rem; i++) {
                mul *= i;
            }

            sum += mul;
            n /= 10;
        }

        if (sum == temp) {
            System.out.println(temp + " is a Strong Number.");
        } else {
            System.out.println(temp + " is not a Strong Number.");
        }
    }
}
