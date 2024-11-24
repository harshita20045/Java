class Count16{
public static void main(String [] args){
int count=1;
for(int i=1;i<=5;i++){
for(int j=1 ;j<=5;j++){
if(i%2==0){
System.out.print(" A");
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
 1 2 3 4 5
 A A A A A
 1 2 3 4 5
 A A A A A
 1 2 3 4 5
*/