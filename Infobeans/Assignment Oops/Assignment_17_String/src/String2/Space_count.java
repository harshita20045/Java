package String2;

import java.util.Scanner;

public class Space_count {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
	
	int count=0;
	for(int i=0;i<str.length();i++) 
	{
		if(str.charAt(i)==' ')
		{
			count++;
		}
	
	}
	System.out.println("Space count : "+count);
   }
}
