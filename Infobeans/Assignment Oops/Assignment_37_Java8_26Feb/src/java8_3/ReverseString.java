package java8_3;

import java.util.function.Function;

public class ReverseString {

	public static void main(String[] args) {
		Function<String,String> f= a->{
			StringBuffer s=new StringBuffer(a);	
			 return s.reverse().toString();
		};
		
		System.out.println(f.apply("sdretefds"));
	}
}
