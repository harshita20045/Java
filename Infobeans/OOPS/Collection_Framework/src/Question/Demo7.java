package Question;
import java.util.LinkedList;

public class Demo7 {
	public void show() {
		LinkedList<String> list=new LinkedList<String>();
		System.out.println(list.getFirst());// java.util.NoSuchElementException
		
	}
public static void main(String[] args) {
	Demo7 d7=new Demo7();
	d7.show();
}
}
