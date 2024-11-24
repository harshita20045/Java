import java.util.Scanner;
class Armstrong{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number : ");
            int n=sc.nextInt();          
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
              System.out.println("Armstrong");
           }
           else
           {
             System.out.println("Not Armstrong");
           }
}
}