package Collection14;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Calculate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String s=sc.nextLine();
	TreeMap<Character,Integer> t=new TreeMap<>();
	char a;
	int c;
	for (int i = 0; i < s.length(); i++) {
		a=s.charAt(i);
		c=0;
		for (int j = 0; j < s.length(); j++) {
			if(a==s.charAt(j)) 
			{
				c++;
			}
			
		}
		t.put(a, c);
		
	}
	for (Entry<Character, Integer> ch : t.entrySet()) {
	System.out.println("'"+ch.getKey()+"'"+" : "+ch.getValue());
		
	}
}
}
