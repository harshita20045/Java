import java.util.Scanner;
class Array10
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
		System.out.print("Merge : ");
		
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
			
			System.out.println();
			
			int ae[]=new int[n];
			System.out.print("Reverse Merge : ");
		
			for(int i=0;i<n2;i++)
			{
				ae[i]=a2[i];		
			}
			for(int i=0;i<n1;i++)
			{
				ae[n2+i]=a1[i];	
			}
			for(int i=0;i<n;i++)
			{
				System.out.println((i+1)+" element : "+ae[i]);
			}
			
			System.out.println();
			
			int ae1[]=new int[n];
			System.out.print("first Reverse Merge : ");
		
			for(int i=0;i<n2;i++)
			{
				ae1[i]=a2[n2-i-1];		
			}
			for(int i=0;i<n1;i++)
			{
				ae1[n2+i]=a1[i];	
			}
			for(int i=0;i<n;i++)
			{
				System.out.println((i+1)+" element : "+ae1[i]);
			}
	}
}