class Calculate
{
	void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println("Sum = "+c);
	}
	void substract()
	{
		int a=10,b=20;
		int c=a-b;
		System.out.println("Substract = "+c);
	}void multiply()
	{
		int a=10,b=20;
		int c=a*b;
		System.out.println("Multiply = "+c);
	}void division()
	{
		float a=10,b=20;
		float c=a/b;
		System.out.println("Division = "+c);
	}
	public static void main(String args[])
	{
		Calculate a=new Calculate();
		a.add();
		a.substract();
		a.multiply();
		a.division();
	}
}