package functionalInterface;


interface WordReverse{
	public void reverseWords(String sentence);
}
public class Reverse {
public static void main(String[] args) {
	String s= "hii i am harshita";
	WordReverse w=str->{
		String m = "";
		String []a=str.split(" ");
		for (int i = 0; i < a.length; i++) {
			StringBuffer str1=new StringBuffer(a[i]);
			m= m+ str1.reverse().toString()+" ";
			
			
		}
		System.out.println(m);
	};
	w.reverseWords(s);
}
}
