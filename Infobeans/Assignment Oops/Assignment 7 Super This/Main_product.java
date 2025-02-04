class Product 
{
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) 
	{
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() 
	{
        return productId;
    }

    public String getName() 
	{
        return name;
    }

    public double getPrice() 
	{
        return price;
    }

    public void displayDetails() 
	{
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class Electronics extends Product 
{
    private int warranty; 

    public Electronics(int productId, String name, double price, int warranty) 
	{
        super(productId, name, price);
        this.warranty = warranty;
    }

    public void displayElectronicsDetails() 
	{
        displayDetails();
        System.out.println("Warranty: " + warranty + " months");
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    public void displayClothingDetails() {
        displayDetails();
        System.out.println("Size: " + size);
    }
}

class Grocery extends Product 
{
    private String expiryDate;

    public Grocery(int productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    public void displayGroceryDetails() 
	{
        displayDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

public class Main_product 
{
    public static void main(String[] args) 
	{
        Electronics electronic = new Electronics(101, "Smartphone", 699.99, 24);
        Clothing clothing = new Clothing(202, "T-Shirt", 19.99, "L");
        Grocery grocery = new Grocery(303, "Milk", 2.49, "2024-12-31");

        electronic.displayElectronicsDetails();
        clothing.displayClothingDetails();
        grocery.displayGroceryDetails();
    }
}
