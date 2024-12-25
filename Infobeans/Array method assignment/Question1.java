import java.util.Scanner;
class Question1
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
		for(i=0;i<10;i++)
		{	
			display(x[i]);
	    }
	
	}
	static void display(int y)
	{
		System.out.println(y);
	}
}