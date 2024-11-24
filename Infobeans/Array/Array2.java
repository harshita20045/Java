import java.util.Scanner;
class 	Array2{
	public static void main(String args[])
	{
		System.out.print("WAP to print sum of alternate nos of an integer array");
		System.out.println();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=s.nextInt();
		int a[]=new int[n];
		int i,sum=0;
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
		System.out.println("Alternatives of that : ");
		System.out.println();
		for(i=0;i<n;i+=2)
		{
		
			System.out.println("Element "+(i+1)+" : "+a[i]);
			sum+=a[i];
		}
		System.out.println("Sum of alternative number is : "+sum);	
	}
}