import java.util.Scanner;
class Max
{
	public static void main(String [] args)
	{
		int a[]={1,-3,2,5,6};
		int i,max=a[0];
		for(i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum : "+max);
		
	}
	
}