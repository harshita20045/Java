package Pattern_print;

public class Fourth {
	 public void fourth(int n) {
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 1) { 
	                for (int j = 1; j <= i; j++) {
	                    System.out.print(j + " ");
	                }
	            } else { 
	                for (int j = 1; j <= i; j++) {
	                    System.out.print("* ");
	                }
	            }
	            System.out.println();
	        }
	    }
}
