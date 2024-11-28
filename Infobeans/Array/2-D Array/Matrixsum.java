import java.util.Scanner;
class Matrixsum
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of matrix : ");
		int n=s.nextInt();
		
		int a[][]=new int[n][n];
		int i,j,sum=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter value at a["+i+"]["+j+"] : " );
				a[i][j]=s.nextInt();
				sum+=a[i][j];
				
			}
			System.out.println();
		}
		System.out.println("Sum : "+sum);
		
	}
}