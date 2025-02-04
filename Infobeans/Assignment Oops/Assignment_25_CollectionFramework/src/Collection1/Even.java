package Collection1;

import java.util.ArrayList;

public class Even {
	public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
    a1.add(1);
    a1.add(2);
    a1.add(3);
    a1.add(4);
    a1.add(5);
    a1.add(6);
    a1.add(7);
    a1.add(8);
    a1.add(9);
    a1.add(10);
    
    for(Integer i:a1) {
    	if(i%2==0) {
    		System.out.println(i);
    	}
    }
    
	}

}
