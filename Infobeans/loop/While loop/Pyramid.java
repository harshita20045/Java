class Pyramid{
public static void main(String [] args){
int n=5;
int i=1;
int count =0;
while(i<=n){
int j=1;
          while(j<2*n){
                 if(j<(n-i)+1||j>=(n+i)){
                 System.out.print(" ");
                   }
                  else{
                System.out.print("*");
                } 
j++;     
 }
i++;
System.out.println();
}
}}