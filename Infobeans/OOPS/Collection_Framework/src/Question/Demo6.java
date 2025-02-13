package Question;

import java.util.ArrayList;
import java.util.List;



public class Demo6 {
	public void show() {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		System.out.println(list.getFirst());
	}
public static void main(String[] args) {
	Demo6 d6=new Demo6();
	d6.show();
}
}
