import java.util.Scanner;
class Table1{
public static void main (String [] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a number : ");
int n=s.nextInt();
for(int i=1;i<=10;i++){
for(int j=1; j<=n;j++){

System.out.print(i*j+"|");
}
System.out.println();
}
}
}
