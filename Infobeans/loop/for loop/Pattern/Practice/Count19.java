import java.util.Scanner;
class Count19{
public static void main (String [] args){
for(int i=1;i<=5;i++){
for(int j=1;j<=i;j++){
if(j%2==0){
System.out.print("O");
}
else{
System.out.print("1");
}
}
System.out.println();
}
}
}