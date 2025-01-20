import java.util.Scanner;
class 	Find{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of Expenses : ");
		int n=s.nextInt();
		int expense[]=new int[n];
		int i,sum=0;
		for(i=0;i<expense.length;i++)
		{
			System.out.print("Enter age of "+(i+1)+" Student :");
			expense[i]=s.nextInt();	
	    }
		int min=expense[0];
		int max=0;
		System.out.println();
		for(i=0;i<expense.length;i++)
		{
			sum+=expense[i];
			if(max<expense[i])
			{
				max=expense[i];
			}
			if(min>expense[i])
			{
				min=expense[i];
			}
		}
		System.out.println();
		System.out.println("Sum : "+sum);
		System.out.println("Minimum : "+min);
		System.out.println("Maximum : "+max);
		System.out.println();
			
	}
	
}