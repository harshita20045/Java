/*
Bob has been tasked with creating a program to calculate and display the circumference and area of the circle.
The program should allow Bob to input the radius of a circle as both an Integer and a double and compute both the circumference and area of the circle using separate overloaded methods:
1. calculateCircumference- To calculate the circumference using the formula 2 3.14 radius
2. calculateArea To calculate the area 3.14 radius radius
Write a program to help Bob.
Input Format:
The first line of input consists of an integer m, representing the radius of the circle as a whole number.
The second line consists of a double value n, representing the radius of the circle as a decimal number.
Output format:
The first line of output displays two space-separated double values, rounded to two decimal places, representing the circumference of the circle with the integer radius and the double radius,
respectively.
The second line displays two space-separated double values, rounded to two decimal places, representing the area of the circle with the integer radius and the double radius, respectively.
Refer to the sample output for formatting specifications.
Code constraints:*/

import java.util.Scanner;
class Calculate 
{
    double calculateCircumference(int radius) 
	{
        return 2 * 3.14 * radius;
    }

    double calculateCircumference(double radius) {
        return 2 * 3.14 * radius;
    }

    double calculateArea(int radius) {
        return 3.14 * radius * radius;
    }

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}
class Question5
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
		Calculate c=new Calculate();
        int m = s.nextInt();
        double n = s.nextDouble();

        double c_int = c.calculateCircumference(m);
        double c_double = c.calculateCircumference(n);

        double a_int = c.calculateArea(m);
        double a_double = c.calculateArea(n);

        System.out.printf( "%.2f  %.2f\n"c_int,c_double );
        System.out.println(a_int,a_double );
       
	}
}