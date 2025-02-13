package Question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Demo3 {
	public void show() {
		ArrayList<String> list1=new ArrayList<String>();
		List<Integer> list2=new LinkedList<Integer>();
		boolean a=(list1.getClass()==list2.getClass());
		System.out.println(a);
	}
public static void main(String[] args) {
	Demo3 d2=new Demo3();
	d2.show();
}
}
