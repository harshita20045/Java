class Pyramid{
public static void main(String [] args){
int n=5;
int count =0;
for(int i=1;i<=n;i++){
          for (int j=1;j<2*n;j++){
                 if(j<(n-i)+1||j>=(n+i)){
                 System.out.print(" ");
                   }
                  else{
                System.out.print("*");
                }      
 }
System.out.println();
}
for(int i=1;i<=n;i++){

          for (int j=1;j<2*n;j++){

                 if(j<(n-i)+1||j>=(n+i)){
                 System.out.print(" ");
                   }
                  else{
                System.out.print(i);
                }      
 }
System.out.println();
}
for(int i=1;i<=n;i++){

          for (int j=1;j<2*n;j++){

                 if(j<(n-i)+1||j>=(n+i)){
                 System.out.print(" ");
                   }
                  else{
count++;
                System.out.print(count+" ");
                }      
 }
System.out.println();
}

}
}