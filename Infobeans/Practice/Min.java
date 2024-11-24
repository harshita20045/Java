import java.util.Scanner;
class Min{
public static void main(String [] args){
Scanner s=new Scanner(System.in);

int min;
System.out.print("Enter Number"+1 +" : ");
int a =s.nextInt();
min=a;
for(int i=2;i<10;i++){
System.out.print("Enter Number"+i +" : ");
 a =s.nextInt();

if(min>a){
min=a;
}
}
System.out.println("Maximum Number is :"+min);

}}