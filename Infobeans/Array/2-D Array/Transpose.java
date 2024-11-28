import java.util.Scanner;
class Transpose 
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of row : ");
		int r=s.nextInt();
		System.out.print("Enter size of column : ");
		int c=s.nextInt();
		int a[][]=new int[r][c];
		int i,j;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("Enter value at a["+i+"]["+j+"] : " );
				a[i][j]=s.nextInt();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j] +" ");
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Transpose");
		System.out.println();
		
		
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(a[j][i]+" " );
				
			}
			System.out.println();
		}
	}
}