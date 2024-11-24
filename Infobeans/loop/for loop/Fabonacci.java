class Fabonacci
{
      public static void main(String [] args)
      {
            int NUMBER=0;
       	     int Number=1,c,number=9;
          
            for(int i=0;i<number;i++)
            {              System.out.println(NUMBER);
                 c=NUMBER+Number;
                 NUMBER=Number;
                Number=c;
            }
      }
}