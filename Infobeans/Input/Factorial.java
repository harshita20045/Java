class Factorial{
      public static void main(String [] args){
           int n =3;
           int mul=1;

         for (int i=0; i<n;i++){
             mul*=(n-i);
         }
System.out.println("Factorial = "+mul);
     }

}