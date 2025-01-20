abstract class Payment {
    double amount;
    String transactionID;

    Payment(double amount, String transactionID) {
        this.amount = amount;
        this.transactionID = transactionID;
    }

    abstract void processPayment();

    void displayDetails() {
        System.out.println("Transaction ID: " + transactionID + ", Amount: $" + amount);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String transactionID, String cardNumber) {
        super(amount, transactionID);
        this.cardNumber = cardNumber;
    }

    void processPayment() {
        System.out.println("Processing credit card payment for amount: $" + amount);
    }
}

class PaypalPayment extends Payment {
    String paypalID;

    PaypalPayment(double amount, String transactionID, String paypalID) {
        super(amount, transactionID);
        this.paypalID = paypalID;
    }

    void processPayment() {
        System.out.println("Processing PayPal payment for amount: $" + amount);
    }
}

public class PaymentMain {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment(150.75, "TXN123", "1234-5678-9012-3456");
        ccp.processPayment();
        ccp.displayDetails();

        System.out.println();

        PaypalPayment ppp = new PaypalPayment(89.99, "TXN456", "user@example.com");
        ppp.processPayment();
        ppp.displayDetails();
    }
}
