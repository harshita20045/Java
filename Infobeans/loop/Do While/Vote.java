import java.util.Scanner;
class Vote{
public static void main (String [] args){
Scanner s=new Scanner(System.in);
int n;


do{
System.out.println("Enter Your age : ");
n=s.nextInt();

}while(n<=18);
System.out.println("ENTER YOU ARE ELIGIBLE FOR VOTE");

}

}