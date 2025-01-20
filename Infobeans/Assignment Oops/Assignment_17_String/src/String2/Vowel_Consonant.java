package String2;

import java.util.Scanner;

public class Vowel_Consonant 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		int v=0;
		int c=0;
		for(int i=0;i<str.length();i++) 
		{
			int a=str.charAt(i);
		
			if(a>=97&&a<=128||a>=65&&a<=96)
			{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				v++;
			}
			else
			{
				c++;
			}
			
		}
			
		}
		System.out.println("Vowel : "+v);
		System.out.println("Consonant : "+c);
	}
}
