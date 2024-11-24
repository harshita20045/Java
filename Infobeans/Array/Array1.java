import java.util.Scanner;
class 	Array1{
	public static void main(String args[])
	{
		System.out.print("WAP to Print  only even nos. from an integer array");
		System.out.println();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+" element :");
			a[i]=s.nextInt();	
	    }
		System.out.println();
		System.out.println("You have Entered "+n+" elements : ");
		System.out.println();
		for(i=0;i<n;i++)
		{
			System.out.println("Element "+(i+1)+" : "+a[i]);
		}
		System.out.println();
		System.out.println("Even from that : ");
		System.out.println();
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			System.out.println("Element "+(i+1)+" is even : "+a[i]);
		}	
	}
}