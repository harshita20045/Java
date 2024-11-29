import java.util.Scanner;
class Spiral1 
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of matrix : ");
		int n=s.nextInt();
		
		int a[][]=new int[n][n];
		int i,j,value=0,left=0,top=0,down=n-1,right=n-1;
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
		System.out.println("Spiral :");
		while(value<=n/2)
		{
			for(j=left;j<=right;j++)
			{
				
			System.out.print(a[top][j]+" ");	
									
			}
			top++;
			right--;
			for(j=top;j<=down;j++)
			{
				
			System.out.print(a[j][n-top]+" ");	
									
			}
			down--;
			
			for(j=right;j>=left;j--)
			{
				
			System.out.print(a[n-left-1][j]+" ");	
									
			}
			left++;
			for(j=right;j>=left;j--)
			{
				
			System.out.print(a[j][value]+" ");	
									
			}
			value++;
		
		}
	}
}