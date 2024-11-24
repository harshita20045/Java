class Count27{
public static void main (String [] args)
{
int n=9;
for(int i=1;i<=n;i++){
for(int j=1;j<=2*n;j++){
if(j==(2*n/2)||i==n/2||((j==1||j==2*n)&&i<=n/2)){
System.out.print(" * ");
}else{
System.out.print("   ");
}
}
System.out.println();

}
}
}