import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        
        int currentNum = 1;
        int difference = 1;  

        
        System.out.print("The sequence is: ");
        
       
        for (int i = 0; i < n; i++) {
            System.out.print(currentNum + " ");
            currentNum += difference;  
            difference++;  
        }

        
    }
}