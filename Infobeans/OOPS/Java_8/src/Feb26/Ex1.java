package Feb26;

import java.util.function.Function;

public class Ex1 {
public static void main(String[] args) {
	Function<String,Integer> f=x->x.length();
	System.out.println(f.apply("Harshita"));
}
}
