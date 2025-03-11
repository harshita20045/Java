package Collection14;
import java.util.*;
class Sort implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	

}
public class StudentRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());

        Map<Integer, String> m = new TreeMap<>(new Sort());

        for (int i = 0; i < n; i++) {
        	System.out.print("Enter marks : ");
            int marks = Integer.parseInt(sc.nextLine());
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            m.put(marks, name);
        }

        int rank = 1;
        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println("Rank " + rank + ": " + entry.getValue()+" : "+entry.getKey());
            rank++;
        }

        sc.close();
    }
}
