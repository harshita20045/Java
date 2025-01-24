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
			
		
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z')
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
