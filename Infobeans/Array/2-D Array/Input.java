import java.util.Scanner;
class Input 
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of row : ");
		int r=s.nextInt();
		System.out.print("Enter size of column : ");
		int c=s.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("Enter value at a["+i+"]["+j+"] : " );
				a[i][j]=s.nextInt();
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j] +" ");
				
			}
			System.out.println();
		}
	}
}