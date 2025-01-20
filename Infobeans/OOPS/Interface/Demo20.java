interface Pushpa1
{
	int x=10;
	void hello();
}
class Alpha implements Pushpa1
{
	//void hello()           ---Error
	public void hello()
	{
		System.out.println("hello guys");
	}
}
class Demo20
{
	public static void main(String args[])
	{
		Pushpa1 obj=new Alpha();
		obj.hello();
	}
}