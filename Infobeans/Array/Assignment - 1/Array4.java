import java.util.Scanner;
class 	Array4{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("WAP to print to print array elements which are multiples of 23");
		System.out.println();
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+" number : ");
			a[i]=s.nextInt();
		}
		System.out.println("Multiples of 23 are :");
		for(int i=0;i<n;i++)
		{
			if(a[i]%23==0)
			System.out.println("Enter "+(a[i])+" is multiple of 23 . ");
		}
	}
}