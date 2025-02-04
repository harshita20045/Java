package Collection1;

import java.util.ArrayList;

public class Perfect {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
	    a1.add(1);
	    a1.add(2);
	    a1.add(3);
	    a1.add(496);
	    a1.add(5);
	    a1.add(6);
	    a1.add(7);
	    a1.add(28);
	    a1.add(9);
	    a1.add(8128);
	    
	    System.out.println(a1);
	    System.out.println();
	    System.out.println("Perfect : ");
	    for(Integer a:a1) {
	    	int sum=0;			
			for(int i=1;i<a;i++)
			{
				if(a%i==0)
				{
					sum=sum+i;
				}
			}
            
           if(sum==a)
           {
              System.out.println(a);
           }
          
	    }
	}

}
