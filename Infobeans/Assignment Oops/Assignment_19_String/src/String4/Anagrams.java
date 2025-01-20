package String4;

import java.util.Scanner;

public class Anagrams {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();

	        if (str1.length() != str2.length()) {
	            System.out.println("Are the strings anagrams? No");
	        } else {
	            char[] arr1 = str1.toCharArray();
	            char[] arr2 = str2.toCharArray();
	            java.util.Arrays.sort(arr1);
	            java.util.Arrays.sort(arr2);

	            if (new String(arr1).equals(new String(arr2))) {
	                System.out.println("Are the strings anagrams? Yes");
	            } else {
	                System.out.println("Are the strings anagrams? No");
	            }
	        }
	    }
}
