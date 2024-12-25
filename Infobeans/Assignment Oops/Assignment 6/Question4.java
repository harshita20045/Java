import java.util.Scanner;
class Question4{
public static void main (String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter first number : ");
int a=s.nextInt();
System.out.print("Enter second number : ");
int b=s.nextInt();
for(int i=1;i<=10;i++){
for(int j=a; j<=b;j++){

System.out.print(i*j+"|");
}
System.out.println();
}
}
}
