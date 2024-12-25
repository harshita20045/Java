class ArrayDisplay 
{
     void displayArray(int[] arr)
	 {
        System.out.println("Array elements:");
        for (int i=0;i<arr.length;i++)
			{
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        displayArray(array);
    }
}
