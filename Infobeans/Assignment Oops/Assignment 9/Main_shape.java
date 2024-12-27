/*Assignment 1: Shape Area Calculation
Create a parent class Shape with a method calculateArea() that prints "Area calculation not defined for Shape."
Create subclasses:
Circle that overrides calculateArea() to calculate and print the area of a circle.
Rectangle that overrides calculateArea() to calculate and print the area of a rectangle.
Write a Main class to demonstrate polymorphism using an array of Shape objects.*/

class Shape 
{
    void calculateArea() 
	{
        System.out.println("Area calculation not defined for Shape.");
    }
}

class Circle extends Shape 
{
    double r;

    Circle(double r) {
        this.r = r;
    }

    void calculateArea() 
	{        
        System.out.println("Area of Circle: " + (3.14*r*r));
    }
}

class Rectangle extends Shape 
{
    double l, b;

    Rectangle(double l, double b) 
	{
        this.l = l;
        this.b = b;
    }

    
    void calculateArea() 
	{

        System.out.println("Area of Rectangle: " + (l*b));
    }
}

public class Main_shape
{
    public static void main(String[] args) 
	{
        Shape s[] = new Shape[3];
        s[0] = new Shape();
        s[1] = new Circle(5);
        s[2] = new Rectangle(4, 6);

        for (Shape x : s) {
            x.calculateArea();
        }
    }
}
