class Count28{
public static void main (String [] args)
{
int n=20;
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(i==j||j==1||i==1||i==n||j==n||i-1==n-j){
System.out.print(" + ");
}else{
System.out.print("   ");
}
}
System.out.println();

}
}
}