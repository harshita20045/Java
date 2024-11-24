import java.util.Scanner;
class Prime{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number : ");
int n =s.nextInt();
 for(int i=2;i<=n;i++)
 {  int check=0;
      for(int j=2;j<i;j++){
       if(i%j==0)
       {
           check=1;
       }    
     }
     if(check==0){
          System.out.println(i);
      }  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
  }
 }
}