package Exception1;

public class Que1 {
    public static void main(String[] args) {
       
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero " );
        } finally {
            System.out.println("Division operation completed.");
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index ");
        } finally {
            System.out.println("Array access attempt completed.");
        }

    
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format " );
        } finally {
            System.out.println("Number parsing attempt completed.");
        }

        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Null object access: " );
        } finally {
            System.out.println("Null object handling completed.");
        }
    }
}
