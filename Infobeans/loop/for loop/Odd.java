import java.util.Scanner;
class Odd{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number : ");
int n =s.nextInt();
int sum=0;
 for(int i=1;i<=n;i++)
 {
      if (i%2!=0){
System.out.println(i);
}
  }

 }
}