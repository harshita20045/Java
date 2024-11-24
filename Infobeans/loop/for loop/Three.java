import java.util.Scanner;
class Three{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number : ");
int n =s.nextInt();
int sum=0;
 for(int i=1;i<=n;i++)
 {
      if (i%3==0){
sum+=i;}
  }
System.out.println("Sum of number divisible by 3 is : "+sum);
 }
}