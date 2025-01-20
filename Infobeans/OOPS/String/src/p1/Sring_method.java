package p1;

public class Sring_method {

	public static void main(String[] args) {
		
		String s1 = "  She is kid   "; 
		
		System.out.println("1.   replaces all occurrences of \"first\" to \"second\"");
		String s2 = s1.replace("is", "was");
		System.out.println(s2);
		
		System.out.println("2.   Upper case");
		System.out.println(s2.toUpperCase());
		
		System.out.println("3.   Lower  case");
		System.out.println(s2.toLowerCase());
		
		System.out.println("4.   eliminates white space before and after string");
		System.out.println(s2.trim());
		
		System.out.println("5.  start with check and return boolean ");
		System.out.println(s2.startsWith("She"));
		 
		System.out.println("6.  ends with check and return boolean  ");
		System.out.println(s2.endsWith("d"));
		 
		System.out.println("7.  valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String.");
		int a = 10;    
		String s = String.valueOf(a);
		System.out.println(s + 10);
		 
		System.out.println("8.  The substring method in Java returns a new string that represents the specified portion of the original string.");
		String s3 = "Harshita";    
		String substr = s3.substring(0);
		System.out.println(substr);
		String substr1 = s3.substring(1);
		System.out.println(substr1);
		String substr2 = s3.substring(1, 5);
		System.out.println(substr2);
		
		System.out.println("9.   replaceAll()");
		String s4 = "JavaJavaJava";
		System.out.println(s4.replaceAll("J", "K"));
		
		System.out.println("10.  equals() method checks if two strings are exactly the same");
		System.out.println(s3.equals("Harshita"));
		
		System.out.println("11.  equalsIgnoreCase() ignores case differences");
		System.out.println(s3.equalsIgnoreCase("harshita"));
		
		System.out.println("12.  length() gives the length of the string");
		System.out.println(s3.length());
		
		System.out.println("13.  charAt() gives character at index");
		System.out.println(s3.charAt(2));
		
		System.out.println("14.  contains() checks if substring is present");
		System.out.println(s3.contains("shi"));
		
		System.out.println("15.  isEmpty() checks if string is empty");
		String emptyString = " ";//if we give space it return false and if not it will return true
		System.out.println(emptyString.isEmpty());
		
		//explain
		System.out.println("16.  split() splits string into array");
		String[] words = s1.split(" ");
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println("17.  join() joins strings with delimiter");
		System.out.println(String.join("-", "Java", "Python", "C++"));
		
		System.out.println("18.  concat() joins two strings");
		System.out.println(s3.concat(" Baghel"));
		
		System.out.println("19.  compareTo() compares strings lexicographically");
		System.out.println(s3.compareTo("Harshita"));
		
		System.out.println("20.  compareToIgnoreCase() ignores case while comparing");
		System.out.println(s3.compareToIgnoreCase("harshita"));
		
		System.out.println("21.  indexOf() finds first occurrence index");
		System.out.println(s3.indexOf('a'));
		
		System.out.println("22.  lastIndexOf() finds last occurrence index");
		System.out.println(s3.lastIndexOf('a'));
		
		//explain
		System.out.println("23.  intern() returns canonical representation");
		String s5 = new String("Java").intern();
		System.out.println(s5);
	}
}
