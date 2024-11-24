class Prime{
public static void main(String [] args){
           int i=2;
           int n=100;
          int check=0;
           while(i<=n){
           int j=2;
            while(j<i)
            {
              if(i%j==0){
                 check=1;
             }  
            j++;     
            }
            if(check==0){
              System.out.println(i);
             }
              check=0;
             i++;
           }

}
}