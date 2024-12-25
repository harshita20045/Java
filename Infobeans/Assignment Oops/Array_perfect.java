import java.util.Scanner;
class Array_perfect
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			a[i]=s.nextInt();
		}
		System.out.println();
		System.out.print("Perfect numbers are : ");
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			
			for(int j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					sum=sum+j;
				}
			}
            
           if(sum==a[i])
           {
              System.out.println(a[i]);
			  count ++;
           }
           
		}
		System.out.print("Total numbers are : "+count);
	}
}