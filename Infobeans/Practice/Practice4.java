import java.util.Scanner;

/*Loop Assignments -
1. Write a program to print all tables from 1 to 10
2. Write a program to print all tables b/w given 2 inputs
3. Write a program to print the series 1 + 2 + 3+ 4 ………  + n along with its sum
4. Write a program to print the series 1/1 + 1/2 + 1/3...…. + 1/n along with its sum
5. Write a program to print the series 1/ 1! + 1/2! + 1/3! …… + 1/ n! along with its sum
6. Write a program to print all factorials between 2 given nos.
7.  Write a program to print the Fibonacci series 
8. Write a program to print Fibonacci series between 2 given nos.
9. Write a program to print reverse of any given no.
10. Write a program to check whether a given no. is Armstrong or not
*/
class Practice4{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);

/*
System.out.println("1. Write a program to print all tables from 1 to 10");
for(int i=1;i<=10;i++){
for(int j=1;j<=10;j++){
System.out.print(i *j);
}
System.out.println();

}
System.out.println();
System.out.println();
System.out.println();



System.out.println("2. Write a program to print all tables b/w given 2 inputs");
System.out.print("Enter first number :");
int a=sc.nextInt();
System.out.print("Enter second number :");
int b=sc.nextInt();
for(int i=a;i<=b;i++){
for(int j=1;j<=10;j++){
System.out.println(i+" * "+j + " = "+(i*j));
}
System.out.println();
System.out.println();
System.out.println();
}
System.out.println();
System.out.println();
System.out.println();



System.out.println("3. Write a program to print the series 1 + 2 + 3+ 4 ………  + n along with its sum");
System.out.print("Enter a number :");
int n3=sc.nextInt();
int sum3=1;
for(int i=1;i<=n3;i++){
System.out.print(i+" ");
 sum3+=i;
}
System.out.println();
System.out.print("Sum : "+sum3);
System.out.println();
System.out.println();
System.out.println();



System.out.println("4. Write a program to print the series 1/1 + 1/2 + 1/3...…. + 1/n along with its sum");
System.out.print("Enter a number :");
int n4=sc.nextInt();
double sum4=0;
for(int i=1;i<=n4;i++){
System.out.print("1/"+i+"  ");
 sum4+=(1.0/i);
}
System.out.println();
System.out.print("Sum : "+sum4);

System.out.println();
System.out.println();
System.out.println();



System.out.println("5. Write a program to print the series 1/ 1! + 1/2! + 1/3! …… + 1/ n! along with its sum");

System.out.print("Enter a number :");
int n5=sc.nextInt();
int a5=1;
double sum5=0;
for(int i=1;i<=n5;i++){
System.out.print("1/"+i+"!  ");
for(int j=i;j>=1;j--){
a5*=i;
}
sum5+=(1.0/a);
}
System.out.println();
System.out.print("Sum : "+sum5);
*/
System.out.println("6. Write a program to print all factorials between 2 given nos.");

System.out.print("Enter first number :");
int x=sc.nextInt();
System.out.print("Enter second number :");
int y=sc.nextInt();

double sum5=0;
for(int i=x;i<=y;i++){
System.out.print(i+" : ");
int a5=1;
for(int j=i;j>=1;j--){
a5*=j;

}
System.out.println(a5);
}
System.out.println();
System.out.println();
System.out.println();

System.out.println("10. Write a program to check whether a given no. is Armstrong or not");
System.out.print("Enter Number : ");
int no=s.nextInt();
for(int m=1;m<=no;m++){
int n=m;
int r,count=0,sum=0,mul=1;
int temp=n;
while(n!=0){
r=n%10;
n=n/10;
count++;
}
n=temp;
while(n!=0){
r=n%10;
mul=1;
for(int i=1;i<=count;i++){
mul*=r;
}
sum+=mul; 
n=n/10;                      
}
if(temp==sum){
System.out.println(sum);
}

}


}
}
