import java.util.Scanner;
class Question3
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
		int count_even=0,count_odd=0;
		for(int i=0;i<10;i++)
		{	
			if(y[i]%2==0)
				count_even++;
			else
				count_odd++;
	    }
		System.out.println("Even count : "+count_even);
		System.out.println("Odd count : "+count_odd);
	}
}