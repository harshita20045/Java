import java.util.Scanner;
class Calculator{
public static void main (String [] args){
Scanner sc =new Scanner(System.in);
int choice;
do{
System.out.println("*****************Calculator****************");

System.out.println("Which operation would you like to perform :");
System.out.println("Your Choices are :");
System.out.println("Press 1 : Addition");
System.out.println("Press 2 : Substraction");
System.out.println("Press 3 : Multiplication");
System.out.println("Press 4 : Division");
System.out.println();
System.out.print("Enter Your Choice :");
int c=sc.nextInt();

switch(c)
{
case 1:      
System.out.println("Please enter two numbers :");
System.out.print("First No.");
int f=sc.nextInt();
System.out.print("Second No.");
int s =sc.nextInt();int sum=f+s;
             System.out.println("Addition of " +f+" and "+s+" is : "+sum);
             break;
case 2:      int sub=f-s;
             System.out.println("Substraction of " +f+" and "+s+" is : "+sub);
             break;
case 3:      int mul=f*s;
             System.out.println("Multiplication of " +f+" and "+s+" is : "+mul);
             break;
case 4:      float div=f/s;
             System.out.println("Division of " +f+" and "+s+" is : "+div);
             break;

default : System.out.println("Wrong Choice");
System.out.println();

}

System.out.println();
System.out.println("Press 5 : For More Calculations");
 choice=sc.nextInt();

}while(choice==5);

}
}