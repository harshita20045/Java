import java.util.Scanner;
class Table{
public static void main(String [] args){
Scanner sc =new Scanner(System.in);
System.out.print("Enter a no. which table do you want to print :");
int a=sc.nextInt();
for(int i=1;i<=10;i++){
System.out.println(a+" * "+i+" = "+a*i);
}
}
}