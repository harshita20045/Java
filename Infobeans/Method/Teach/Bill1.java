import java.util.Scanner;

class Bill1{
    float qty, rate, amt, dis, net;
    int ino;
    String itemName;
    void getDetails() {
        Scanner s = new Scanner(System.in);

        System.out.println("\nWelcome to the Billing System!");
        System.out.print("Enter Item No: ");
        ino = s.nextInt();
        s.nextLine();

        System.out.print("Enter Item Name: ");
        itemName = s.nextLine();

        System.out.print("Enter Quantity: ");
        qty = s.nextFloat();

        System.out.print("Enter Rate per Unit: ");
        rate = s.nextFloat();
    }

    
    void process() {
        amt = qty * rate;

     
        if (amt > 1000) {
            dis = amt * 0.20f; // 20% discount
        } else if (amt > 500) {
            dis = amt * 0.10f; // 10% discount
        } else {
            dis = amt * 0.05f; // 5% discount
        }

        net = amt - dis;
    }

   
    void putDetails() {
        System.out.println("\n******** BILL ********");
        System.out.println("Item No: " + ino);
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + qty);
        System.out.printf("Rate per Unit: ₹%.2f\n", rate);
        System.out.printf("Total Amount: ₹%.2f\n", amt);
        System.out.printf("Discount: ₹%.2f\n", dis);
        System.out.printf("Net Amount: ₹%.2f\n", net);
        System.out.println("**********************");
    }

   
    public static void main(String[] args) {
        

        System.out.println("Welcome! Let's calculate your bill.\n");
        
            Bill1 b = new Bill1();
            b.getDetails();
            b.process();
            b.putDetails();

            

        System.out.println("\nThank you for using the Billing System!");
    }
}
