import java.util.Scanner;
class Question2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);			
		int x[]=new int[10];
		int i;
		for(i=0;i<10;i++)
		{
			System.out.print("Enter "+(i+1)+" : ");
			x[i]=s.nextInt();	
			
	    }
		display(x);
		System.out.println();
	}
	static void display(int y[])
	{
		for(int i=0;i<10;i++)
		{	
		System.out.println((i+1)+" Element : " +y[i]);		
	    }
	}
}