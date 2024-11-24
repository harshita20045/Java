import java.util.Scanner;
class Time{
public static void main (String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number : ");
int n=s.nextInt();
int m=n/60;
int h=m/60;
System.out.println("Press 1 --> to convert in hour");
System.out.println("Press 2 --> to convert in minute");
System.out.println("Press 3 --> to convert in both");
int c=s.nextInt();
switch(c){
case 1:System.out.println("Hour : "+ h);
break;
case 2:System.out.println("Minute : "+m);
break;
case 3:System.out.println("Both : "+h+"hours , "+m+"minutes");

}
}
}