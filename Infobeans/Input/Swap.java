import java.util.Scanner;
class Swap{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter First Number Before Swapping: ");
int a=sc.nextInt();

System.out.print("Enter Second Number Before Swapping: ");
int b=sc.nextInt();

 a=a+b;
 b=a-b;
 a=a-b;
System.out.print(" First Number After Swapping: "+a);
System.out.println();
System.out.print(" Second Number After Swapping: "+b);


}
}