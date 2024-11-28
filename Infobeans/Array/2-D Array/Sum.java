import java.util.Scanner;
class Sum 
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of row : ");
		int r=s.nextInt();
		System.out.print("Enter size of column : ");
		int c=s.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int ab[][]=new int[r][c];
		int i,j;
		for( i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("Enter value at a["+i+"]["+j+"] : " );
				a[i][j]=s.nextInt();
			}
			System.out.println();
		}
		System.out.println();
		for( i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("Enter value at b["+i+"]["+j+"] : " );
				b[i][j]=s.nextInt();
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				ab[i][j]=a[i][j]+b[i][j];                                                                                                
				System.out.print(ab[i][j]+ " " );
				
			}
			System.out.println();
		}
		
	}
}