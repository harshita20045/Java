package java8_4;

import java.util.ArrayList;
import java.util.List;

class Product
{
	private int id;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
public class ProductMain {
public static void main(String[] args) {
	Product p1=new Product(101, "Product1", 10);
	Product p2=new Product(102, "Product2", 20);
	Product p3=new Product(103, "Product3", 30);
	Product p4=new Product(104, "Product4", 40);
	Product p5=new Product(105, "Product5", 50);
	Product p6=new Product(106, "Product6", 60);
	
	ArrayList<Product>  l=new ArrayList<>();
	l.add(p1);
	l.add(p2);
	l.add(p3);
	l.add(p4);
	l.add(p5);
	l.add(p6);
	List<Product> l1= l.stream().map(x->{x.setPrice((x.getPrice()/15)+x.getPrice());
			 return x;}).toList();
	l1.forEach(w->System.out.println(w));
	
}
}
