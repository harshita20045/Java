package Feb3;

import java.util.ArrayList;

public class Ex1 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();  //Non Generic(it will show Warning)
	a1.add(10);
	a1.add("Rashmika");
	a1.add(123.20);
	a1.add("Rashmika");
	System.out.println(a1);
	
}
}
