import java.util.Scanner;
class Min
{
	public static void main(String [] args)
	{
		int a[]={1,-3,2,5,6};
		int i,min=a[0];
		for(i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum : "+min);
		
	}
	
}