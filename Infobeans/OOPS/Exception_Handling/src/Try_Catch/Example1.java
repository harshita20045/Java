package Try_Catch;

public class Example1 {

	public static void main(String args[]) 
	{
		System.out.println("main start");
		String x=args[0];
		System.out.println("first");
		String y=args[1];
		System.out.println("second");
		int a=Integer.parseInt(x);
		System.out.println("third");
		int b=Integer.parseInt(y);
		System.out.println("fourth");
		int c=a/b;
		System.out.println(c);
		System.out.println("done");
		
	}
}
