import java.util.Scanner;
class Array6
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("6. WAP to replace all odd positions array values with 0");
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
			if(i%2==0)
				a[i]=0;
		}
		System.out.println();
        System.out.println(" replaced odd positions of array values with 0");
		for(int i=0;i<n;i++)
		{
			System.out.println("element : "+a[i]);
		}

		
		
		
		
		
	}
}                                      