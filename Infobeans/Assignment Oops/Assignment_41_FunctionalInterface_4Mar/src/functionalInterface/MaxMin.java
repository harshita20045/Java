package functionalInterface;

interface MinMaxFinder{
	public void find(int[] arr);
}
public class MaxMin {
public static void main(String[] args) {
	int[] arr= {4,2,1,5,3,6,9,10,7};
	MinMaxFinder m =n->{
		
		int min=n[0];
		int max=min;
		for (int i = 1; i < n.length; i++) {
			if(min>n[i]) 
			{
				min=n[i];
			}
			if(max<n[i]) 
			{
				max=n[i];
			}
		}
		System.out.println("min : "+min +" max : "+max);
		};
		m.find(arr);
}
}
