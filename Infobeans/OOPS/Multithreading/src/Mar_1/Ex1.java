package Mar_1;

class MyClass implements Runnable {

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("myClass");
		}
	}
}

public class Ex1 {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		Thread t = new Thread(obj);
		t.start();
		for (int i = 0; i < 60; i++) {
			System.out.println("main");
		}
	}
}
