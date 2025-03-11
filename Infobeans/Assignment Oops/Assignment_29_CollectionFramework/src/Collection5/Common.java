package Collection5;

import java.util.HashSet;
import java.util.Set;

public class Common {
    public static void main(String[] args) {
      
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

       
        Set<Integer> s2 = new HashSet<Integer>();
        s2.add(30);
        s2.add(4);
        s2.add(5);
        s2.add(60);

      
        Set<Integer> s = new HashSet<Integer>(s1);
        s.retainAll(s2);

       
        System.out.println("Set 1: " + s1);
        System.out.println("Set 2: " + s2);
        System.out.println("Common elements: " + s);
    }
}
