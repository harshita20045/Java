package String3;
import java.util.Scanner;
public class Consonant {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a string: ");
	        String str = scanner.nextLine();

		int count=0;
		for(int i=0;i<str.length();i++) 
		{
			int v=str.charAt(i);
		
			if(v>=97&&v<=128||v>=65&&v<=96)
			{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				
			}
			else
			{
				count++;
			}
			
		}
		}
        System.out.println("No. of Consonant : "+count);
		
	}
	
}
