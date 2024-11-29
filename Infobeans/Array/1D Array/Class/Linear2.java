import java.util.Scanner;
class Linear2
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int search,count=0,i;
		for( i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			a[i]=s.nextInt();
		}
		System.out.println();
		System.out.print("Enter element you want to search : ");
			search=s.nextInt();
		for( i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				count++;
			}
		}
		
			System.out.println(search +" is "+count+" time in array " );
		
	}
}