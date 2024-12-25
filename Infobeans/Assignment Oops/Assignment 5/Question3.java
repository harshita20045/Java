/*
1. WAP to read a no. from user and count how many digits are available in that number

2. WAP to read a no. from user and count how many even and odd digits are available in that number

3. WAP to read a no. from user 
-if a no. is a 2 digit no. than display sum of square of digits
-if a no. is a 3 digit no. than display sum of cube of digits
-if a no. is a 4 digit no. than display sum of digit by applying power 4

4. WAP to read a no. from user and count how many digits are available in that number

*/
import java.util.Scanner;
class Question3
{
public static void main(String [] args)
{
            Scanner s=new Scanner(System.in);
            System.out.println("Enter a number : ");
            int n=s.nextInt();          
            int temp=n;
            int rem;
            int count=0;
            int sum=0;
            int mul=1;
            while(n!=0)
            {
               rem=n%10;
             
               n=n/10;
                 count++;
            }
                 n=temp;
            while(n!=0)
            {
               mul=1;
               rem=n%10;
               for(int i=1;i<=count;i++)
               {
                    mul*=rem;
               }
               sum=sum+mul;
               n=n/10;
            }
           System.out.println("Your no. is "+count+" digit no. and the sum by in powers of "+count+" is : "+sum);

}
}
