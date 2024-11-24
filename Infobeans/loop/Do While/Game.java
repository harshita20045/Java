import java.util.Scanner;
class Game{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("- WELCOME TO OUR GAME -");
System.out.println();
System.out.println("- ENTER NUMBER BETWEEN 1 TO 10 -");
System.out.println();
int n;
do{
System.out.print("Enter a Number : ");
n=s.nextInt();
if (n>10||n<1){
System.out.println("- ENTER NUMBER BETWEEN 1 TO 10 -");
System.out.println();
}
if(n<2){
System.out.println("- ENTER GREATER NUMBER -");
System.out.println();
}
if(n>2){
System.out.println("- ENTER LESSER NUMBER -");
System.out.println();
}
}while(n!=2);
System.out.println();
System.out.println("- YOU ARE WINNER -");
}
}