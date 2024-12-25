/*Task 1: Defining a Class
Create a class named Book to represent books in a library.
The class should have the following attributes (fields):
title (String) to store the title of the book.
author (String) to store the author's name.
price (double) to store the price of the book.
quantity (int) to store the number of copies available.
Include the following methods:
A constructor to initialize the title, author, price, and quantity.
A method displayDetails() that prints all the details of the book.
Task 2: Creating Object
Create a Main class with a main method.
Inside the main method:
Create three Book objects with different details.
Call the displayDetails() method for each object to display the book's information.
*/
class Book_info
{
	private String title;
	private String author;
	private double price;
	private int quantity;
	
	Book_info(String title,String author,double price,int quantity)
	{
		this.title=title;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}
	void display()
	{
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
		System.out.println("Quantity : "+quantity);
		System.out.println();
		
	}
}
class Book
{
	public static void main(String args[])
	{
		
		Book_info b1=new Book_info("A Prisoner Scrapbook","L.K. Advani",200,45);
		b1.display();
		Book_info b2=new Book_info("A River Sutra","Gita Mehta",300,20);
		b2.display();
		Book_info b3=new Book_info("A Call to Honour","Jaswant Singh",400,32);
		b3.display();
		
	}
}