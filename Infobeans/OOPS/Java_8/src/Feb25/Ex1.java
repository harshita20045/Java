package Feb25;
interface I1
{
      public void add(int a,int b);
}
class A implements I1
{
public void add(int a, int b)
{
System.out.println(a+b);
}
}

public class Ex1 {
	public static void main(String args[])
	{
	    I1 obj = new A();
	obj.add(10,20);
	}
}
