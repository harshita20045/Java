import java.util.Scanner;
class Assignment{
public static void main(String [] args){
Scanner sc =new Scanner(System.in);
System.out.println();
int a =10;
int b=5;
int c=(++b)*(a);
System.out.println(c);
a=(c++);
System.out.println(c);
System.out.println((a++)>=12);

}}