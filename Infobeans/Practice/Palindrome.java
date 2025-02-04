class Palindrome
{
     public static void main(String [] args)
    {
            int n=121;
            int temp=n;
            int sum =0;
            int rem;
            while(n!=0)
           {
               rem=n%10;
               sum=sum*10+rem;
               n=n/10;
           }

           if(sum==temp)
           {
              System.out.println("Palindrome");
           }
           else
           {
             System.out.println("Not Palindrome");
           }
    }

}