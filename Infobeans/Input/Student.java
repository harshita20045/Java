import java.util.Scanner;

class Student{
public static void main (String [] args){
Scanner sc =new Scanner(System.in);
System.out.print("Enter your Marks : ");
int marks=sc.nextInt();
if (marks<=100&&marks>=91)
{
System.out.println("A");
}
else if(marks>80)
{
System.out.println("B");
}
else if(marks>70){
System.out.println("c");
}
else if(marks>60){
System.out.println("D");
}
else if(marks>30){
System.out.println("E");
}
else{
System.out.println("Fail");
}

}
}