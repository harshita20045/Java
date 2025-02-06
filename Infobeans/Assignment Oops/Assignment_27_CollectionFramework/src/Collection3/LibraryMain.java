package Collection3;

import java.util.LinkedList;
import java.util.Scanner;

class Book
{
	private int bookid;
	private String title;
	private String author;
	private String issuedToStudent;
	public Book(int bookid, String title, String author, String issuedToStudent) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.issuedToStudent = issuedToStudent;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String isIssuedToStudent() {
		return issuedToStudent;
	}
	public void setIssuedToStudent(String issuedToStudent) {
		this.issuedToStudent = issuedToStudent;
	}
	@Override
	public String toString() {
		return "Book  [bookid=" + bookid + ", title=" + title + ", author=" + author + ", issuedToStudent="
				+ issuedToStudent + "]";
	}
	
	
	
}
public class LibraryMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		LinkedList<Book> l=new LinkedList<Book>();
		while(true){
		System.out.println("---- Welcome To Library Book Issuing System ----");
		System.out.println("Press 1 --------> Add a new issued book to the list ");
		System.out.println("Press 2 --------> Remove a book when it is returned");
		System.out.println("Press 3 --------> Find if a particular bookId is currently issued");
		System.out.println("Press 4 --------> Display all issued books");
		System.out.println("Press 5 --------> Exit");
		System.out.println();
		System.out.print("Enter Your Choice : ");
		int choice=Integer.parseInt(scanner.nextLine());
		if(choice == 5) {
			break;
		}
		switch (choice) {
		case 1: 
			  System.out.print("Enter Book Id: ");
              int bookid =Integer.parseInt(scanner.nextLine()) ;
              System.out.print("Enter Title: ");
              String title = scanner.nextLine();
              System.out.print("Enter author name: ");
              String author = scanner.nextLine();
              System.out.print("Enter yes/no for book is issued to student or not: ");
              String issuedToStudent = scanner.nextLine();
              Book b=new Book(bookid,title,author,issuedToStudent);
              l.add(b);
              System.out.println("Added Successfully");
              
       break;
            
        
        case 2:
        	System.out.print("Enter bookid for returning a book :");
        	int search=Integer.parseInt(scanner.nextLine());
        	System.out.println();
        	for(Book i : l) 
        	{
        		if(i.getBookid()==search) {
        			l.remove(i);
        			System.out.println("Removed successfully ");
        			break;
        		}
        	}
         break;
         
        case 3:
        	System.out.println("These are currently Issued : ");
        	for(Book i:l) {
        		if(i.isIssuedToStudent().equalsIgnoreCase("yes")) {
        			System.out.println(i.getBookid());
        		}
        	}		
        break;
        
        case 4:
        	for(Book i : l) 
        	{
        		System.out.println(i);
        	}
       
		System.out.println();
		break;
		default:
		    System.out.println("Invalid choice");;
		}
		

		
	}
		System.out.println("THANK YOU FOR VISITING");
	}
}
