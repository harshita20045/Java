package java8_2;

import java.util.ArrayList;
import java.util.function.Predicate;

class Product{
	private int id;
	private String name;
	private double price;
	private double rating;
	
	
	public Product(int id, String name, double price, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}

	
}
public class ProductMain {
	
	public static void main(String[] args) {
		
		
		
		Product p1=new Product(101,"fj",678,6);
		Product p2=new Product(102,"fj",67,3);
		Product p3=new Product(103,"fj",578,4);
		Product p4=new Product(104,"fj",678,5);
		Product p5=new Product(105,"fj",78,67);
		ArrayList<Product> l=new ArrayList<>();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		l.add(p5);
		
		ArrayList<Product> l1=new ArrayList<>();
		
		Predicate<Product> p=a->(a.getPrice()>=500&&(a.getRating()>=4.0&&a.getRating()<=5.0));
		for (Product p11 : l) {
			if (p.test(p11)) {
				l1.add(p11);
			}
		}
		
		
		for (Product p12 : l1) {
			System.out.println(p12);
		}
		
	}

}
