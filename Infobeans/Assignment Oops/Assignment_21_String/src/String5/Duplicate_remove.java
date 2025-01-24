package String5;

import java.util.Scanner;

public class Duplicate_remove {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            
            int f = 0;

           
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == s.charAt(i)) {
                    f = 1;
                    break;
                }
            }

         
            if (f==0) {
                result.append(s.charAt(i));
            }
        }

        System.out.println("Modified String: " + result);
    }
}
