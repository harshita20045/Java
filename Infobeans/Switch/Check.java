import java.util.Scanner;
class Check{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int n,k;
System.out.print("Enter a number : ");
n=s.nextInt();
if(n==0){
k=0;
}
else if(n>0){
k=1;

}
else{
k=-1;

}
switch(k){
case 0:System.out.println("Zero");
break;
case 1:System.out.println("Positive");
break;
default :System.out.println("Negative");
}


}
}