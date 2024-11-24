class Count9{
public static void main(String [] args){
int n=1;
for(int i=1;i<=5;i++){
for(int j=1;j<2*i;j++){
if(j==1||j==2*i-1){
System.out.print(" 0");
}
else{
System.out.print(" "+n);
n++;
}
}
System.out.println();
}

}
}