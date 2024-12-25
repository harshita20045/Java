import java.util.Scanner;
class Array_armstrong
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int search,flag=0,i;
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			a[i]=s.nextInt();
		}
		System.out.println();
		System.out.print("Armstrong numbers : ");
		
		for(i=0;i<a.length;i++)
		{
			int temp=a[i];
            int rem;
            int count=0;
            int sum=0;
            int mul=1;
            while(temp!=0)
            {
               rem=temp%10;
             
               temp=temp/10;
                 count++;
            }
                 temp=a[i];
            while(temp!=0)
            {
               mul=1;
               rem=temp%10;
               for(int j=1;j<=count;j++)
               {
                    mul*=rem;
               }
               sum=sum+mul;
               temp=temp/10;
            }
           if(sum==a[i])
           {
              System.out.println(a[i]);
           }
           
		}
		
	}
}