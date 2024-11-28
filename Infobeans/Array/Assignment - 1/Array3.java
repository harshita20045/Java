import java.util.Scanner;
class 	Array3{
	public static void main(String args[])
	{
		System.out.print("3. WAP to print Average of all array elements");
		System.out.println();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		float sum=0;
		float av;
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
		System.out.println();
		for(i=0;i<n;i++)
		{
			sum+=a[i];		
		}	
		av=sum/n;
		System.out.print("Average : "+av);
	}
}