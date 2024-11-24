class Count14{
public static void main(String [] args){
int count=1;
for(int i=1;i<=5;i++){
for(int j=1 ;j<=5;j++){
if(i==j){
System.out.print(" 0");
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
 0 2 3 4 5
 1 0 3 4 5
 1 2 0 4 5
 1 2 3 0 5
 1 2 3 4 0
*/