class Shape 
{
    String color;

    void displayColor() 
	{
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape 
{
    double radius;

    Circle(String color, double radius) 
	{
        super.color = color;
        this.radius = radius;
    }

    void calculateArea() 
	{
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
        super.displayColor();
    }
}

public class Main_shape 
{
    public static void main(String[] args) 
	{
        Circle circle = new Circle("Red", 5);
        circle.calculateArea();
    }
}
