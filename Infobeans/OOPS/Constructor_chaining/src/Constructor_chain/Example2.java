package Constructor_chain;
class A1 {
	A1(){
		System.out.println("Default A");
	}
	A1(int x){
		System.out.println("Single para of A");
	}
	{
		System.out.println("Instance of A");
	}
	
	static{
		System.out.println("Static of A");
	}
}
class B1 extends A1{
	B1(){
		System.out.println("Default B");
	}
	B1(int x){
		
		System.out.println("Single para of B");
	}
	{
		System.out.println("Instance of B");
	}
	
	static{
		System.out.println("Static of B");
	}
}
public class Example2 {
	static {
		System.out.println("main class static");
	}
public static void main(String[] args) {
	System.out.println("main start");
	B1 obj1 =new B1();
	B1 obj2 =new B1(101);
}
}
