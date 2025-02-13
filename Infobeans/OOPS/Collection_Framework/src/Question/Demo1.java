package Question;

import java.util.LinkedList;
import java.util.List;

public class Demo1 {
	public void show() {
		List<String> list=new LinkedList<String>();
		System.out.println(list.getClass());
	}
public static void main(String[] args) {
	Demo1 d1=new Demo1();
	d1.show();
}
}
