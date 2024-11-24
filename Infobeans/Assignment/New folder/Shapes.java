//2. Java Program to Find the Area of Shapes using Switch Case
import java.util.Scanner;
class Shapes{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Shapes :-");
System.out.println("Press 1 - Circle");
System.out.println("Press 2 - Square");
System.out.println("Press 3 - Rectangle");
System.out.println("Press 4 - Triangle");
System.out.print("Enter your choice : ");
int n=sc.nextInt();
switch(n){
case 1:System.out.println("Enter a radius :");
      int r=sc.nextInt();
     
     System.out.println("Area of circle is :"+ (3.14*r*r));
break;
case 2:System.out.println("Enter a side :");
      int s=sc.nextInt();

     System.out.println("Area of Square is :"+ (s*s));
break;
case 3:System.out.println("Enter a length :");
      int l=sc.nextInt();
   System.out.println("Enter a breadth :");
      int b=sc.nextInt();
    
     System.out.println("Area of Rectangle is :"+ (l*b));
break;

default:System.out.println("Not exist");
}


}

}