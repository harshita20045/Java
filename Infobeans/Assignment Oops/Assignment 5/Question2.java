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
class Question2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		int rem,even=0,odd=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			
			n=n/10;
		}
		System.out.println("Number of Even digit : "+even);
		System.out.println("Number of Odd digit : "+odd);
	}
}