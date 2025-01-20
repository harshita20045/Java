package com.calculate;
import java.util.Scanner;
import com.math.Add;
import com.math.Sub;
import com.math.Mul;
import com.math.Div;
public class Development
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double a,b;
		System.out.println("Enter 2 numbers : ");
		a=s.nextDouble();
		b=s.nextDouble();
		Add obj1=new Add(a,b);
		Sub obj2=new Sub(a,b);
		Mul obj3=new Mul(a,b);
		Div obj4=new Div(a,b);
		System.out.println("Add :"+obj1.add());
		System.out.println("Sub :"+obj2.sub());
		System.out.println("Mul :"+obj3.mul());
		System.out.println("Div :"+obj4.div());
		
	}
}