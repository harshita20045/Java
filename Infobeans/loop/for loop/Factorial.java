import java.util.Scanner;
class Factorial{
      public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a Number : ");
           int n =s.nextInt();
           int mul=1;

         for (int i=0; i<n;i++){
             mul*=(n-i);
         }
System.out.println("Factorial = "+mul);
     }

}