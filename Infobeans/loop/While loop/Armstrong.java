import java.util.Scanner;
class Armstrong{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
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
