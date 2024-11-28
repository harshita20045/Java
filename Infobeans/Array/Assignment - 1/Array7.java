import java.util.Scanner;
class Array7
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("7. WAP to swap first 2 array elements");
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
		}
		System.out.println();
        System.out.println("Swapped first 2 array elements");
		
		int temp=a[0];
		a[0]=a[1];
		a[1]=temp;
		for(int i=0;i<n;i++)
		{
			System.out.println("element : "+a[i]);
		}

		
		
		
		
		
	}
}                                      