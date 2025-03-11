package Mar_1;

class MyClass2 extends Thread{
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("venue");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ee) {
				
			}
			Thread.yield();
		}
	}
}
public class Ex2 {
public static void main(String[] args) {
	MyClass2 m=new MyClass2();
	m.start();
	for (int i = 0; i < 20; i++) {
		System.out.println("card print karna hai");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO: handle exception
	}
	
	}
	System.out.println("main");
}
}
