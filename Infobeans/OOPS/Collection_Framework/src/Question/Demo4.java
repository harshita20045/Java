package Question;

import java.util.ArrayList;
import java.util.Collections;

public class Demo4 {
	public void show() {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(9);
		list1.add(4);
		list1.add(5);
		Collections.sort(list1);
		System.out.println(list1);
	}
public static void main(String[] args) {
	Demo4 d4=new Demo4();
	d4.show();
}
}
