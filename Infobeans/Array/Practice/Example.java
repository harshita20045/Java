class Example {
public static void main(String[] args) {
int[] myArray = {1, 2, 3, 4, 5};
int[] newArray = java.util.Arrays.copyOf(myArray, myArray.length);
System.out.println("Copied array: " + java.util.Arrays.toString(newArray));
}
}