import java.util.Scanner;
class Reverse{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
int rem;
int sum =0;
do{
 rem=n%10;
sum=sum*10+rem;
n=n/10;

}while(n!=0);
System.out.println(sum);
}
} 