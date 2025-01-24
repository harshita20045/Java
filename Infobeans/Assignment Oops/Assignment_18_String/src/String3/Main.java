package String3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter venue details: ");
        String[] details = sc.nextLine().split(",");
        System.out.println("Venue Name: " + details[0]);
        System.out.println("City Name: " + details[1]);
    }
}
