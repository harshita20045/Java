import java.util.Scanner;
class Perfect
{
	public static void main(String [] args)
	{
            Scanner s=new Scanner(System.in);
            System.out.print("Enter a number : ");
            int n=s.nextInt();
			int sum=0;			
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
            
           if(sum==n)
           {
              System.out.println("Perfect");
           }
           else
           {
             System.out.println("Not Perfect");
           }
}
}