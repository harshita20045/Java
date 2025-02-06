/*
NOTE: Read all the details from user.
Library Book Management System
Scenario: A library wants to manage books using an ArrayList. Each book has a title, author, ISBN, and price. Implement functionalities to:

Add new books
Display all books
Search for a book by title
Remove a book by ISBN
Find the most expensive book*/
package Collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Library {
    private String title;
    private String author;
    private int isbn;
    private double price;
    
    public Library(String title, String author, int isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getIsbn() {
        return isbn;
    }
    
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return "Library [title=" + title + ", author=" + author + ", isbn=" + isbn + ", price=" + price + "]";
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Library> libraryList = new ArrayList<>();
        
        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add new book");
            System.out.println("2. Display all books");
            System.out.println("3. Search book by title");
            System.out.println("4. Remove book by ISBN");
            System.out.println("5. Find most expensive book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    int isbn = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();                    
                    Library book = new Library(title, author, isbn, price);
                    libraryList.add(book);
                    System.out.println("Book added successfully.");
                    break;
                    
                case 2:
                    if (libraryList.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Library b : libraryList) {
                            System.out.println(b);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    boolean found = false;
                    for (Library b : libraryList) {
                        if (b.getTitle().equalsIgnoreCase(searchTitle)) {
                            System.out.println(b);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter ISBN to remove: ");
                    int isbnToRemove = scanner.nextInt();
                    scanner.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < libraryList.size(); i++) {
                        if (libraryList.get(i).getIsbn() == isbnToRemove) {
                            libraryList.remove(i);
                            System.out.println("Book removed successfully.");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Book not found.");
                    }
                    break;
                    
                case 5:
                    if (libraryList.isEmpty()) {
                        System.out.println("No books available in the library.");
                    } else {
                        Library mostExpensive = libraryList.get(0);
                        for (Library b : libraryList) {
                            if (b.getPrice() > mostExpensive.getPrice()) {
                                mostExpensive = b;
                            }
                        }
                        System.out.println("Most expensive book:");
                        System.out.println(mostExpensive);
                    }
                    break;
                    
               
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
