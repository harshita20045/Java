package Feb_28;

class MyClass extends Thread{
	public void run() {
		for(int i=0;i<=50;i++) {
		System.out.println("myClass");
		}
	}
}
public class Ex1 {
public static void main(String[] args) {
	MyClass obj =new MyClass();
	obj.start();
//	for(int i=0;i<=50;i++) {
//		System.out.println("main");
//		}
}
}
