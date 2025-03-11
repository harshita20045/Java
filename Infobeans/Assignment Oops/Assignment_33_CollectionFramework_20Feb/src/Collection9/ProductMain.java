package Collection9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class Product implements Comparable<Product> {
	private int productId;
	private String productName;
	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
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

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if (this.getProductPrice() < o.getProductPrice()) {
			return -1;
		} else if (this.getProductPrice() > o.getProductPrice()) {

			return +1;
		} else {
			return 0;
		}
	}

}

public class ProductMain {
public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
		ArrayList<Product> l = new ArrayList<>();
	while (true) {
		System.out.println("Add Product :");
		System.out.println("Display  :");
		int choice = Integer.parseInt( sc.nextLine());

		switch (choice) {
		case 1:
			System.out.print("Enter Product Id : ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Product name : ");
			String name = sc.nextLine();
			System.out.print("Enter Product Price : ");
			Double price = Double.parseDouble(sc.nextLine());
			Product p=new Product(id,name,price);
			l.add(p);
			break;
		case 2:
			Collections.sort(l);
			System.out.print("Display  : ");
			for (Product i : l) {
				System.out.println(i);
			}

		}

}
}}