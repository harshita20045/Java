import java.util.Scanner;
class Prime1{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number : ");
int n=s.nextInt();
int flag=0,i;
for( i=2;i<=n;i++){
for(int j=2;j<i;j++)
if(i%j==0){
flag=1;
}

if(flag==0){
System.out.println(i);
}
}
}
}


/*class Prime1{
public static void main(String args[]){
int n=9,flag=0;
for(int i=2;i<=n/2;i++){
if(n%i==0){
flag=1;
break;
}
}
if(flag==1){
System.out.println("Not Prime");
}
else{
System.out.println("Prime");
}
}
}*/