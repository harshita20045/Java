import java.util.Scanner;
class Array8
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("8. WAP to update all array elements with 10");
		System.out.print("Enter size of array : ");
		int n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			a[i]=s.nextInt();
		}
		
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
			System.out.println(i+1+" element : "+a[i]);
			a[i]=10;
		}
		System.out.println();
        System.out.println("updated all array elements with 10");
		

		for(int i=0;i<n;i++)
		{
			System.out.println("element : "+a[i]);
		}

		
		
		
		
		
	}
}                                      