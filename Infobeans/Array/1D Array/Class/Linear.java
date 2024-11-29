import java.util.Scanner;
class Linear
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int search,flag=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			a[i]=s.nextInt();
		}
		System.out.println();
		System.out.print("Enter element you want to search : ");
			search=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element not Found ");
		}
		else
		{
			System.out.println("Element Found ");
		}
	}
}