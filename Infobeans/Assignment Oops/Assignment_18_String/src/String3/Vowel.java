package String3;

import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count=0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				System.out.print((char)(str.charAt(i)-32));
			}
			else 
			{
				System.out.print(str.charAt(i));
			}
			
		}
      
    }
}

