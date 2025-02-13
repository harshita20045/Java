package Question;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Demo8 {
	
public static void main(String[] args) {
	Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,56,7));
	Set<Integer> set2=new HashSet<>(Arrays.asList(3,2,3,4,56,7));
	set1.retainAll(set2);
	System.out.println(set1);
}
}
