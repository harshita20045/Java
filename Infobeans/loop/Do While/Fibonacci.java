import java.util.Scanner;
class Fabonacci{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a number : ");
int n =s.nextInt();
long a=0,b=1,c,i=0;
do{
System.out.println(a);

c=a+b;
a=b;
b=c;
i++;
}while(a<=n);


}
}