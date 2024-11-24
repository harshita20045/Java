import java.util.Scanner;
class User{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a Number : ");
int n=s.nextInt();
int i=0;
do{
System.out.println(n-i);
i++;
}while(i<n);

}
}