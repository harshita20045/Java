package Input;

import java.util.Scanner;

import Operations.Char_count;
import Operations.Consonant;
import Operations.Space;
import Operations.Upper_case;
import Operations.Vowel;
public class User {

	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		Vowel v=new Vowel();
		Consonant c=new Consonant();
		Space sp=new Space();
		Char_count c1=new Char_count();
		Upper_case u=new Upper_case();
		String str;
		System.out.print("Enter a String : ");
		str=s.nextLine();
		
		System.out.println("Enter a character : ");
		char ch=s.next().charAt(0);  
		System.out.println();
		System.out.println(" ------------------Answer after applying operations----------------------");
		System.out.println();
		
		System.out.print("Number of vowel in String are : " + v.vowel_count(str));
		System.out.println();		
		System.out.print("Number of Consonant in String are : " + c.consonant_count(str));
		System.out.println();
		System.out.print("Number of Space in String are : " + sp.space_count(str));
		System.out.println();
		System.out.print("Number of Character in String are : " + c1.char_count(str,ch));
		System.out.println();
		System.out.print("Vowel Upper Case : ");
		u.upper_case(str);
		System.out.println();
		
		
	}
	
}
