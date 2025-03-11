package java8_1;

interface StringLength
{
	public int getLength(String a);
}
public class Length {

	public static void main(String[] args) {
		StringLength s1=  s->s.length();
	System.out.println(s1.getLength("hjb"));
		
	}
}
