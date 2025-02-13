package Question;

import java.util.ArrayList;
import java.util.LinkedList;


public class Demo2 {
	public void show() {
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		boolean a=(list1.getClass()==list2.getClass());
		System.out.println(a);
	}
public static void main(String[] args) {
	Demo2 d2=new Demo2();
	d2.show();
}
}
