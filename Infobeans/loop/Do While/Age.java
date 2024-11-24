import java.util.Scanner;
class Age{
public static void main (String [] args){
Scanner s=new Scanner(System.in);


char c;
do{
System.out.println("Enter Your age : ");
int n=s.nextInt();
if(n<=10){
System.out.println("!! YOU ARE A CHILD !!");
}
else if(n<=18){
System.out.println("!! YOU ARE A TEENAGER !!");
}
else if(n<=10){
System.out.println("!! YOU ARE A ADULT !!");
}
else if(n<=100){
System.out.println("!! YOU ARE A SENIOR CITIZEN !!");
}
else{
System.out.println("!! YOU ARE A NOT ELIGIBLE !!");
}
System.out.println("-----------------------------------------");
System.out.println("!! IF YOU WANT TO USE IT MORE : !!");
System.out.println("PRESS : a");
 c=s.next().charAt(0);
}while(c=='a');


}

}