package Collection7;

import java.util.*;

class Product {
    private int pid;
    private String pname;
    private double pprice;

    public Product(int pid, String pname, double pprice) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public double getPprice() {
        return pprice;
    }

    @Override
    public String toString() {
        return "Product [PID=" + pid + ", Pname=" + pname + ", Pprice=" + pprice + "]";
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Product> v = new Vector<>();

        System.out.print("Enter the number of products: ");
        int numOfProducts = Integer.parseInt(scanner.nextLine());

        
        for (int i = 0; i < numOfProducts; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");

            System.out.print("Enter Product ID: ");
            int pid = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Product Name: ");
            String pname = scanner.nextLine();

            System.out.print("Enter Product Price: ");
            double pprice = Double.parseDouble(scanner.nextLine());

            v.add(new Product(pid, pname, pprice));
        }
        scanner.close();

      
        System.out.println("\nDisplaying using foreach:");
        for (Product i : v) {
            System.out.println(i);
        }

        System.out.println("\nDisplaying using Iterator:");
        Iterator<Product> iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nDisplaying using ListIterator (Forward):");
        ListIterator<Product> listIterator = v.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nDisplaying using ListIterator (Backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\nDisplaying using Enumeration:");
        Enumeration<Product> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
