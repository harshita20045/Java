package Collection6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {
public static void main(String[] args) {
	Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
	Set<Integer> set2=new HashSet<>(Arrays.asList(7,2,6,4,8));
	Set<Integer> set=new HashSet<>(set1);
	for(Integer i: set2)
	{
		set.add(i);
	}
	System.out.println(set1);
	System.out.println(set2);
	System.out.println("Union :");
	System.out.println(set);
}
}
