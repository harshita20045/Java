class Count40{
public static void main(String [] args){
int n=3;
int count =1;
for(int i=1;i<=n;i++){
          for (int j=1;j<2*n;j++)
		  {
                 if(j<(n-i)+1||j>=(n+i)){
                 System.out.print(" ");
                   }
                  else{
                System.out.print(count);
				count++;
                }      
 }
System.out.println();
}
}                                                         
}