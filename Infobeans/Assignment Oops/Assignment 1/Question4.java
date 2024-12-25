import java.util.Scanner;
class Question4
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);			
		int x[]=new int[5];
		int i;
		for(i=0;i<x.length;i++)
		{
			System.out.print("Enter "+(i+1)+" : ");
			x[i]=s.nextInt();	
			
	    }
		sum(x);
		System.out.println();
	}
	static void sum(int y[])
	{
		int sum=0;
		for(int i=0;i<y.length;i++)
		{	
			sum=sum+y[i];
	    }
		System.out.println("Sum : "+sum);
		
	}
}