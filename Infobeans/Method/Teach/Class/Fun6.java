import java.util.Scanner;
class Fun6
{
	int x,y;
	void add(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("Sum : "+(a+b));

	};
	
	void sub()
	{
		System.out.println("Substract : "+(x-y));

	}
	void mul()
	{
		
		System.out.println("Multipication  : "+(x*y));

	}
	void div()
	{

		System.out.println("Division : "+((x *1.0)/y));

	}
	public static void main(String [] args)
	{
		Fun6 f=new Fun6();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 values : ");
		int a=s.nextInt();
		int b=s.nextInt();
		f.add(a,b);
		f.sub();
		f.mul();
		f.div();
	}
}