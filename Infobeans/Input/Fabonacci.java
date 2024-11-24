class Fabonacci
{
      public static void main(String [] args)
      {
            int a=0;
       	     int b=1,c,n=9;
          
            for(int i=0;i<n;i++)
            {              System.out.println(a);
                 c=a+b;
                 a=b;
                b=c;
            }
      }
}