class Alpha1
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	void sum(double a,double b)
	{
		System.out.println(a+b);
	}
	void sum(int a,double b)
	{
		System.out.println(a+b);
	}
	void sum(double a,int b)
	{
		System.out.println(a+b);
	}
	void sum(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Alpha1 obj1=new Alpha1();
		obj1.sum(10,20);
		obj1.sum(10,20,30);
		obj1.sum(10.5,12.7);
		obj1.sum(10,12.7);
		obj1.sum(10.87,12);
		obj1.sum("Hello","Guys");
		
	}
}