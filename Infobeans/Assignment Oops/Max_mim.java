import java.util.Scanner;
class Max_mim
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
		for( i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("Enter value at a["+i+"]["+j+"] : " );
				a[i][j]=s.nextInt();
			}
			System.out.println();
		}
		int max=a[0][0],min=a[0][0];
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
		System.out.println();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				} 
				if(min>a[i][j])
				{
					min=a[i][j];
				}                                                        
				
			}
			
		}
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
		
	}
}