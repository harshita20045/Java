package Collection1;

import java.util.ArrayList;

public class Operations {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
	    a1.add(1);
	    a1.add(0);
	    a1.add(3);
	    a1.add(4);
	    a1.add(5);
	    System.out.println("Add 5 integers to an ArrayList : ");
	   System.out.println(a1);
	   System.out.println();
	   System.out.println("Replace the second element with a new integer : "+a1.set(1,2));
	   System.out.println(a1);
	   System.out.println();
	   System.out.println("Remove the third element : "+a1.remove(2));
	   System.out.println(a1);
	   System.out.println();
	   System.out.println("Display the updated ArrayList : ");
	   System.out.println(a1);
	  
	}

}
