package Collection5;

import java.util.HashSet;
import java.util.Set;

public class Subset {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

      
        Set<Integer> s2 = new HashSet<Integer>();
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4);
        s2.add(5);

     if( s1.containsAll(s2)) {
    	 System.out.println("S2 is subset of s1");
     }
     if( s2.containsAll(s1)) {
    	 System.out.println("S1 is subset of s2");
     }
     
       
    }
}
