import java.util.Scanner;
class Array5
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter size of first array : ");
		int n1=s.nextInt();
		int a1[]=new int[n1];
		
		System.out.println();
		
		for(int i=0;i<n1;i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			a1[i]=s.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Enter size of second array : ");
		int n2=s.nextInt();
		int a2[]=new int[n2];
		System.out.println();
		for(int i=0;i<n2;i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			a2[i]=s.nextInt();
		}
		int n=n1+n2;
		int a[]=new int[n];
		
		
			for(int i=0;i<n1;i++)
			{
				a[i]=a1[i];		
			}
			for(int i=0;i<n2;i++)
			{
				a[n1+i]=a2[i];	
			}
			for(int i=0;i<n;i++)
		{
			System.out.println((i+1)+" element : "+a[i]);
		}
		
		
	}
}