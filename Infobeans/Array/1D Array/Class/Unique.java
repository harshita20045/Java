import java.util.Scanner;
class Second_largest
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("2. WAP to remove the duplicates elements from the array and print unique elements");
		System.out.println();
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		int a[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter " +(i+1)+" number : ");
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter " +(i+1)+" number : "+a[i]);
		}
		System.out.println();
			System.out.println("Second largest element : "+a[n-2]);
		
	}
}

