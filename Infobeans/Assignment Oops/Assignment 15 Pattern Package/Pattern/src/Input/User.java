package Input;
import java.util.Scanner;

import Pattern_print.First;
import Pattern_print.Fourth;
import Pattern_print.Second;
import Pattern_print.Third;


public class User{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();

        First f = new First();
        Second s1 = new Second();
        Third t = new Third();
        Fourth f1 = new Fourth();

        System.out.println("Star Pattern:");
        f.first(n);

        System.out.println("\nNumber Pattern:");
        s1.second(n);

        System.out.println("\nNumber Row Pattern:");
        t.third(n);

        System.out.println("\nMixed Pattern:");
        f1.fourth(n);
    }
}
