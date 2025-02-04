package Feb3;

import java.util.ArrayList;

public class Exp5_Iterate1_forEach {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	System.out.println(a1);
	
	for(Integer i:a1) {
		System.out.println(i);
	}
}
}
