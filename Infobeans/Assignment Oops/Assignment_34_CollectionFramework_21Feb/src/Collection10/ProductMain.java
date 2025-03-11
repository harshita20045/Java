package Collection10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Quantity implements Comparator<Product>
{
	public int compare(Product i1,Product i2) {
		if(i1.getQuantity()<i2.getQuantity()) 
		{
			return +1;
		}
		else if(i1.getQuantity()>i2.getQuantity()) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
	}
class Name implements Comparator<Product>
{
	public int compare(Product i1,Product i2) {
		return i1.getProductName().compareTo(i2.getProductName());
	}
}
class Product implements Comparable<Product>
{
   private int productId;
   private String productName;
   private double price;
   private int quantity;
public Product(int productId, String productName, double price, int quantity) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "\n\nproductId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
			+ quantity + "]";
}
@Override
public int compareTo(Product o) {
	if(this.getPrice()<o.getPrice()) 
	{
		return -1;
	}
	else if(this.getPrice()>o.getPrice()) 
	{
		return +1;
	}
	else
	{
		return 0;
	}
	
}  
   
}

public class ProductMain {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	ArrayList<Product> t=new ArrayList<>();
	while(true) 
	{
		System.out.println("Press 1 ---> Add Product Detail");
		System.out.println("Press 2 ---> Print");
		System.out.println("Press 3 ---> Sort by product quantity");
		System.out.println("Press 4 ---> Sort by name");
		System.out.println();
		System.out.println("Enter your choice : ");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice) 
		{
		case 1: System.out.print("Enter Id : ");
		int id=Integer.parseInt(sc.nextLine());
		 System.out.print("Enter name : ");
		String name =sc.nextLine();
		 System.out.print("Enter price : ");
		double price=Double.parseDouble(sc.nextLine());
		System.out.print("Enter quantity : ");
		int quantity=Integer.parseInt(sc.nextLine());
		Product p=new Product(id,name,price,quantity);
		t.add(p);
		break;
		case 2:System.out.println("Price : ");
		Collections.sort(t);
		System.out.println(t);
		break;
		case 3:System.out.println("Quantity : ");
		t.sort(new Quantity());
		System.out.println(t);
		break;
		case 4:System.out.println("Product Name: ");
		t.sort(new Name());
		System.out.println(t);
		break;
		

		}
		
	}
}
}
