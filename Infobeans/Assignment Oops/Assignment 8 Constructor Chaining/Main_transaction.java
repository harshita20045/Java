import java.util.Scanner;
class Transaction 
{
    private int transactionId;
    private double amount;

    public Transaction(int transactionId, double amount) 
	{
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public int getTransactionId() 
	{
        return transactionId;
    }

    public double getAmount() 
	{
        return amount;
    }
}

class PeerToPeerTransaction extends Transaction 
{
    private String recipient;

    public PeerToPeerTransaction(int transactionId, double amount, String recipient) 
	{
        super(transactionId, amount);
        this.recipient = recipient;
    }

    public void display() 
	{
		System.out.println();
        System.out.println("Peer-to-Peer Transaction:");
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println("Amount: $" + getAmount());
        System.out.println("Recipient: " + recipient);
    }
}

class OnlinePurchaseTransaction extends Transaction 
{
    private String merchant;

    public OnlinePurchaseTransaction(int transactionId, double amount, String merchant) {
        super(transactionId, amount);
        this.merchant = merchant;
    }

    public void display() 
	{
		System.out.println();
        System.out.println("Online Purchase Transaction:");
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println("Amount: $" + getAmount());
        System.out.println("Merchant: " + merchant);
    }
}

class BillPaymentTransaction extends Transaction 
{
    private String billType;

    public BillPaymentTransaction(int transactionId, double amount, String billType) 
	{
        super(transactionId, amount);
        this.billType = billType;
    }

    public void display() 
	{
		System.out.println();
        System.out.println("Bill Payment Transaction:");
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println("Amount: $" + getAmount());
        System.out.println("Bill Type: " + billType);
    }
}

class Main_transaction 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction ID:");
        int transactionId = sc.nextInt();

        System.out.print("Enter amount:");
        double amount = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter recipient:");
        String recipient = sc.nextLine();

        System.out.print("Enter merchant:");
        String merchant = sc.nextLine();

        System.out.print("Enter bill type:");
        String billType = sc.nextLine();

        PeerToPeerTransaction p2p = new PeerToPeerTransaction(transactionId, amount, recipient);
        OnlinePurchaseTransaction online = new OnlinePurchaseTransaction(transactionId, amount, merchant);
        BillPaymentTransaction bill = new BillPaymentTransaction(transactionId, amount, billType);

        p2p.display();
        online.display();
        bill.display();
    }
}
