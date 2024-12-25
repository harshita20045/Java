import java.util.Scanner;
class Question5
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
		prime(x);
		System.out.println();
	}
	static void prime(int y[])
	{
		int flag=0,i,count=0;
		for( i=0;i<y.length;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(y[i]%j==0)
				{
					flag=1;
				}
			}	
			if(flag==0)
			{
				count++;
			}
		}
		System.out.println("No. of prime no. : "+count);
	}
}
