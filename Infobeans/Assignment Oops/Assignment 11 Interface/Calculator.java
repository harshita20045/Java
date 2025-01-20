/*2. Shape Area Calculator
Objective: Calculate the area of different shapes using a common interface.

Define an interface Shape with a method calculateArea().
Create classes Circle and Rectangle that implement the Shape interface.
Input dimensions and calculate the area of each shape.*/
import java.util.Scanner;
interface Shape
{
	double calculateArea();
}
class Circle implements Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double calculateArea()
	{
		return 3.14*radius*radius;
	}
}
class Rectangle implements Shape
{
	int length,breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double calculateArea()
	{
		return length*breadth;
	}
}
class Calculator
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		Shape s;
		System.out.print("Enter the radius : ");
		double r=sc.nextDouble();
		s=new Circle(r);
		System.out.println("Area of circle is : "+s.calculateArea());
		System.out.print("Enter the length : ");
		int l=sc.nextInt();
		System.out.print("Enter the breadth : ");
		int b=sc.nextInt();
		s=new Rectangle(l,b);
		System.out.println("Area of circle is : "+s.calculateArea());
	}
}
