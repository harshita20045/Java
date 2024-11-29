import java.util.Scanner;
class Loop{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);			
		int a[]=new int[10];
		int i;
		for(i=0;i<10;i++)
		{
			System.out.print("Enter age of "+(i+1)+" Student :");
			a[i]=s.nextInt();	
	    }
		System.out.println();
		System.out.println("You have Entered Age : ");
		System.out.println();
		for(i=0;i<10;i++)
		{
			System.out.println("Age of "+(i+1)+" Student is : "+a[i]);
		}
		System.out.println();
		System.out.println("Reverse : ");
		System.out.println();
		for(i=9;i>=0;i--)
		{
			System.out.println("Age of "+(i+1)+" Student is : "+a[i]);
		}
		
		
		
	}
}