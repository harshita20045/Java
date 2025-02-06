package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Que1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entar size : ");
		int size = scanner.nextInt();
		scanner.nextLine(); 

		ArrayList<Integer> l = new ArrayList<>();
	
		for (int i = 0; i < size; i++) {
			l.add(scanner.nextInt());
		}

		System.out.println("Entar search : ");
		int search = scanner.nextInt();
		System.out.println("Entar remove : ");
		int remove = scanner.nextInt();

		// 1. Check if the search number exists in the ArrayList
		if (l.contains(search)) {
			System.out.println("Number " + search + " exists in the ArrayList");
		} else {
			System.out.println("Number " + search + " is not exists in the ArrayList");
		}

		// 2. Remove the specified element (if present) and display updated ArrayList
		
		l.remove(remove);
		System.out.println("ArrayList after removing " + remove);
		for (Integer i : l) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 3. Print all the elements using a normal for loop
		System.out.println("ArrayList elements using normal for loop");
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
		System.out.println();

		// 4. Print all the elements using the Iterator interface
		System.out.println("ArrayList elements using Iterator interface");
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		// 5. Print all the elements using the for-each loop
		System.out.println("ArrayList elements using for-each loop");
		for (Integer i : l) {
			System.out.print(i+ " ");
		}
		System.out.println();

		// 6. Print all the elements in descending order
		System.out.println("ArrayList elements in descending order");
		
		ArrayList<Integer> l1 = new ArrayList<>(l);
//       
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i;j<n;j++)
//			{
//				if(a[i]>a[j])
//				{
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
		int temp=0;
        for (int i = 0; i < l1.size(); i++) {
           
            for (int j = i ; j < l1.size(); j++) {
                if (l1.get(i) < l1.get(j)) {
                	 temp = l1.get(i);
                     l1.set(i, l1.get(j));
                     l1.set(j, temp);
                }
            }
    
           
        }
      
        for (Integer i: l1) {
            System.out.print(i + " ");
        }
        System.out.println();

		// 7. Count and display the number of elements in the ArrayList
		System.out.println("Number of elements in the ArrayList: " + l.size());

	}
}
