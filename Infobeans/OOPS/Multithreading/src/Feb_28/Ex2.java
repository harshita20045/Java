package Feb_28;

class MyClass1 extends Thread{
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("myClass");
		}
	}
	public void start() {
		
	}
}
public class Ex2 {
public static void main(String[] args) {
	MyClass1 obj=new MyClass1();
	obj.start();
	for (int i = 0; i < 50; i++) {
		System.out.println("main");
	}
}
}
