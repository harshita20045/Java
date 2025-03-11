package java8_3;

import java.util.function.Function;

public class KiloToMile {
public static void main(String[] args) {
	Function<Double,Double> f= a->a*0.621;
	System.out.println(f.apply(1.0));
	
}
}
