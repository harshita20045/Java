/*2. Ashok wants to determine if a given integer is an Armstrong number. He requires your help in implementing a multi-catch block to handle potential issues during user input or calculation.

1.	Create a method isArmstrongNumber that takes an integer input and returns true if it is an Armstrong number, and false otherwise. Throw an IllegalArgumentException if the input is negative.
2.	In the main method, input an integer.
3.	Utilize a multi-catch block to handle the following scenarios:
4.	If the input is negative, catch IllegalArgumentException and print "Error: Input number must be non-negative"
5.	If the input is not a valid integer, catch inputMismatchException and print "Error: Input must be a valid integer."
6.	Finally, print the result.

Assist Ashok in this task.
Input format :
The input consists of an integer N.
Output format :
If N is an Armstrong number, print "N is Armstrong number."
If it is not an Armstrong number, print "N is not Armstrong number."
If N < 0, print "Error: Input number must be non-negative"
If N is other than an integer value, print "Error: Input must be a valid integer."

Refer to the sample output for formatting specifications.
Code constraints :
1 ≤ valid input value ≤ 104
Sample test cases :
Input 1 :
153
Output 1 :
153 is Armstrong number.
Input 2 :
745
Output 2 :
745 is not Armstrong number.
Input 3 :
-9
Output 3 :
Error: Input number must be non-negative
Input 4 :
@34
Output 4 :
Error: Input must be a valid integer.
*/
package Exception3;
import java.util.InputMismatchException;
import java.util.Scanner;
class Armstrong{
	boolean isArmstrongNumber(int n) {

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
        if(sum==temp)
        {
           return true;
        }
        else
        {
        	return false;
        }

		
	}
}
public class Que3 {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	try {
		
		int n=scanner.nextInt();
		if(n<0) {
			throw new IllegalArgumentException("Error: Input number must be non-negative");
		}
		Armstrong a1=new Armstrong();
		if(a1.isArmstrongNumber(n)) {
			System.out.println(n+" is Armstrong number.");
		}
		else {
			System.out.println(n+" is not Armstrong number.");
		}
		
		
	}catch(InputMismatchException e) {
		System.out.println("Error: Input must be a valid integer.");
	}
	catch(IllegalArgumentException e){
		System.out.println(e.getMessage());
	}
	
	
}
}
