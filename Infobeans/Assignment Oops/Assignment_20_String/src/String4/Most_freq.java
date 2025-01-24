package String4;
import java.util.Scanner;

public class Most_freq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        
        int[] freq = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
        	int count=0;
        	for (int j = 0; j < s.length(); j++) {
               if(s.charAt(i)==s.charAt(j)) {
            	   count++;
               }
            }
        	freq[i]=count;
        }

        int max=-1;
        char ch=' ';
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
               ch=  s.charAt(i);
            }
        }

        System.out.println("Most frequent character: " + ch + " (" + max + " times)");
    }
}
