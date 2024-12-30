abstract class A
{
	abstract void m1();
	void m2()
	{
		System.out.println("m2 defined");
	}
}
class B extends A
{
	
}
class Example1
{
	public static void main(String [] args)
	{
		System.out.println("main start");
		A obj1=new A();
	}
}