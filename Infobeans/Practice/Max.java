import java.util.Scanner;
class Max{
public static void main(String [] args){
Scanner s=new Scanner(System.in);

int max=0;
for(int i=1;i<=10;i++){
System.out.print("Enter Number"+i +" : ");
int a =s.nextInt();

if(a>max){
max=a;
}
}
System.out.println("Maximum Number is :"+max);

}
}