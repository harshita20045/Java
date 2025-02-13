package Question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SubsetLogic {
public static void main(String[] args) {
	Set<Integer> set1=new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6));
	Set<Integer> set2=new HashSet<Integer>(Arrays.asList(2,3,4));
	boolean isSubset=true;
	Iterator<Integer> itr1=set2.iterator();
	while(itr1.hasNext()) 
	{
		int element=itr1.next();
		boolean temp=false;
		Iterator<Integer> itr2=set1.iterator();
		while(itr2.hasNext()) 
		{
			if(itr2.hasNext()) 
			{
				temp=true;
			}
			if (!temp) {
				isSubset=false;
				break;
			}
		}
		if(isSubset) 
		{
			System.out.println("s2 is subset of s1");
		}
		else 
		{
			System.out.println("s2 is not subset of s1");
		}
		
	}
	
	
}
}
