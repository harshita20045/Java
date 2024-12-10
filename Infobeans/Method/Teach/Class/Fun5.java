import java.util.Scanner;
class Fun5
{
	int add()
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.print("Enter 1st no. :");
		a=s.nextInt();
		System.out.print("Enter 2nd no. :");
		b=s.nextInt();
		
		return a+b;	
			
	}
	
	public static void main(String [] args)
	{
		Fun5 f1=new Fun5();
		
		System.out.println("Result : "+f1.add());
	}
}