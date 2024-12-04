import java.util.Scanner;
class Sorting
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		int a[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter " +(i+1)+" number : ");
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ascending Order :");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter " +(i+1)+" number : "+a[i]);
		}
	}
}