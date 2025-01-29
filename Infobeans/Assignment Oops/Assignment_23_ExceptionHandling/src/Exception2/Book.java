package Exception2;
import java.util.*;
import java.util.Scanner;

class InvalidQuantityException extends RuntimeException {
    InvalidQuantityException(String str) {
        super(str);
    }
}

class Book1 {
    public int id;
    public String bookTitle;
    public String authorName;
    public float price;
    public int quantity;

    public Book1(int id, String bookTitle, String authorName, float price, int quantity) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }

    public void purchase(int purchasedQuantity) {
        if (purchasedQuantity > quantity) {
            throw new InvalidQuantityException("InvalidQuantityException: Quantity not available");
        } else {
            
            System.out.println("Quantity Available : " + quantity);
        }
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        String bookTitle = scanner.nextLine();
        String authorName = scanner.nextLine();
        float price = Float.parseFloat(scanner.nextLine());
        int quantity = Integer.parseInt(scanner.nextLine());
        
     
        Book1 book = new Book1(id, bookTitle, authorName, price, quantity);

       System.out.println("purchase quantity : ");
        int purchasedQuantity = Integer.parseInt(scanner.nextLine());

        try {
            book.purchase(purchasedQuantity);
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
    }
}
