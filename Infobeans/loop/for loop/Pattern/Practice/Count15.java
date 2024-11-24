class Count15{
public static void main(String [] args){
int count=1;
for(int i=1;i<=5;i++){
for(int j=1 ;j<=5;j++){
if((i%2==0&&j%2!=0)||(i%2!=0&&j%2==0)){
System.out.print(" *");
}
else{
System.out.print(" "+j);
}
}
System.out.println();
}

}
}
/*
 1 * 3 * 5
 * 2 * 4 *
 1 * 3 * 5
 * 2 * 4 *
 1 * 3 * 5
*/