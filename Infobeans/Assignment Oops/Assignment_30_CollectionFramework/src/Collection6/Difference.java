package Collection6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
























































class Difference {
public static void main(String[] args) {
	Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
	Set<Integer> set2=new HashSet<>(Arrays.asList(7,2,6,4,8));
	System.out.println(set1);
	set1.removeAll(set2);
	
	System.out.println(set2);
	System.out.println(set1);
}
}