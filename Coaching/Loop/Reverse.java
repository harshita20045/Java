class Reverse{
public static void main(String arge[]){
int n=1500,r,sum=0;
while(n!=0){
r=n%10;
sum=sum*10+r;
n=n/10;
}

while(sum!=0){
r=sum%10;
System.out.println(r);
sum=sum/10;
}
}
}