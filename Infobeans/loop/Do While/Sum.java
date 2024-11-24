import java.util.Scanner;
class Sum{
public static void main (String [] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a number : ");
int n=s.nextInt();
int sum=0,i=1;
do{
sum+=i;
i++;
}while(i<=n);
System.out.println(sum);
}

}