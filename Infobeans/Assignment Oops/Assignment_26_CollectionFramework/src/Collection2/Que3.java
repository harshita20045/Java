package Collection2;
import java.util.ArrayList;
import java.util.Iterator;

class Product {
    private int pid;
    private String pname;
    private double pprice;
    private String plocation;
    
    public Product(int pid, String pname, double pprice, String plocation) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.plocation = plocation;
    }
    
    public int getPid() {
        return pid;
    }
    
    public void setPid(int pid) {
        this.pid = pid;
    }
    
    public String getPname() {
        return pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }
    
    public double getPprice() {
        return pprice;
    }
    
    public void setPprice(double pprice) {
        this.pprice = pprice;
    }
    
    public String getPlocation() {
        return plocation;
    }
    
    public void setPlocation(String plocation) {
        this.plocation = plocation;
    }
    
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", plocation=" + plocation + "]";
    }
}

public class Que3 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(101, "Laptop", 750.0, "A1"));
        products.add(new Product(102, "Mouse", 250.0, "B1"));
        products.add(new Product(103, "Keyboard", 550.0, "C1"));
        products.add(new Product(104, "Monitor", 850.0, "D1"));
        products.add(new Product(105, "Printer", 400.0, "E1"));
        
        System.out.println("Display all products using for-each loop:");
        for(Product p : products) {
            System.out.println(p);
        }
        
        System.out.println("\nDisplay all products using Iterator:");
        Iterator<Product> it = products.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("\nProducts with price above 500:");
        for(Product p : products) {
            if(p.getPprice() > 500) {
                System.out.println(p);
            }
        }
    }
}
