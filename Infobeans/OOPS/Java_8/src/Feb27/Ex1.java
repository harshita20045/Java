package Feb27;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<>();
	l.add(5);
	l.add(15);
	l.add(89);
	l.add(34);
	l.add(16);
	l.add(88);
	System.out.println(l);
	List<Integer> l1=l.stream().filter(x->x%2==0).collect(Collectors.toList());
	System.out.println(l1);
	
}
}
