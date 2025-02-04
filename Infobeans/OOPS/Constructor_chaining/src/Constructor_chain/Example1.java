package Constructor_chain;
class A {
	A(){
		System.out.println("Default A");
	}
	{
		System.out.println("Instance of A");
	}
	
	static{
		System.out.println("Static of A");
	}
}
class B extends A{
	B(){
		System.out.println("Default B");
	}
	{
		System.out.println("Instance of B");
	}
	
	static{
		System.out.println("Static of B");
	}
}
public class Example1 {

	public static void main(String[] args) {
		B obj =new B();
	}
}
