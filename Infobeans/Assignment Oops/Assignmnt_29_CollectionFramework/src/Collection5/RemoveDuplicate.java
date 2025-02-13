package Collection5;

import java.util.HashSet;


public class RemoveDuplicate {
    public static void main(String[] args) {
      
        Integer [] arr = {1,3,3,4,6,6,7,8};
        System.out.println("Array :");
        for (int n : arr) {
         System.out.print(n);
        }
        System.out.println();
        HashSet<Integer> l = new HashSet<Integer>();
        for (int n :arr) {
            l.add(n);
        }
        System.out.println("Array without duplicate elements : " + l);
//        int i=0;
//        for(Integer a:l) {
//        	arr[i]=a;
//        	i++;
//        }
//        System.out.println("Array without : ");
//        for (int j = 0; j < l.size(); j++) {
//			System.out.print(arr[j]+ " ");
//		}
//      System.out.println();
     
    }
}
