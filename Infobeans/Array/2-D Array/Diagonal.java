import java.util.Scanner;
class Diagonal 
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of matrix : ");
		int n=s.nextInt();
		
		int a[][]=new int[n][n];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter value at a["+i+"]["+j+"] : " );
				a[i][j]=s.nextInt();
			}
			System.out.println();
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j] +" ");
				
			}
			System.out.println();
		}
		System.out.println("Diagonal Element are :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				System.out.print(a[i][j] +"  ");
				else 
					System.out.print("  ");
				
									
			}
			System.out.println();
		}
	}
}