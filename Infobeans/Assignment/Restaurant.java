import java.util.Scanner;

class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int priceMasalaChai = 40;
        int priceLassi = 60;
        int priceMangoLassi = 80;
        int priceRoseLassi = 70;
        int priceCholeBhature = 180;
        int pricePaneerTikka = 150;
        int priceAlooParatha = 50;
        int priceVegBurger = 120;
        int pricePasta = 140;
        int priceSamosa = 20;
        int priceFriedRice = 100;
        int priceDalMakhani = 160;
        int priceGarlicNaan = 40;
        int priceVegetableBiryani = 180;
        int pricePaneerButterMasala = 200;++++++++++
        int priceRoti = 15;
        int priceGulabJamun = 30;

        int choice = 1; 

        do {
            System.out.println("******************* Welcome to our Restaurant *******************");
            System.out.println("What would you like to eat:");
            System.out.println("Your Choices are:");
            System.out.println("Press 1 : Masala Chai - " + priceMasalaChai + " Rs");
            System.out.println("Press 2 : Lassi - " + priceLassi + " Rs");
            System.out.println("Press 3 : Mango Lassi - " + priceMangoLassi + " Rs");
            System.out.println("Press 4 : Rose Lassi - " + priceRoseLassi + " Rs");
            System.out.println("Press 5 : Chole Bhature - " + priceCholeBhature + " Rs");
            System.out.println("Press 6 : Paneer Tikka - " + pricePaneerTikka + " Rs");
            System.out.println("Press 7 : Aloo Paratha - " + priceAlooParatha + " Rs");
            System.out.println("Press 8 : Veg Burger - " + priceVegBurger + " Rs");
            System.out.println("Press 9 : Pasta - " + pricePasta + " Rs");
            System.out.println("Press 10 : Samosa - " + priceSamosa + " Rs");
            System.out.println("Press 11 : Fried Rice - " + priceFriedRice + " Rs");
            System.out.println("Press 12 : Dal Makhani - " + priceDalMakhani + " Rs");
            System.out.println("Press 13 : Garlic Naan - " + priceGarlicNaan + " Rs");
            System.out.println("Press 14 : Vegetable Biryani - " + priceVegetableBiryani + " Rs");
            System.out.println("Press 15 : Paneer Butter Masala - " + pricePaneerButterMasala + " Rs");
            System.out.println("Press 16 : Roti - " + priceRoti + " Rs");
            System.out.println("Press 17 : Gulab Jamun - " + priceGulabJamun + " Rs");

            System.out.print("Enter Your Choice: ");
            int c = sc.nextInt();

            int selectedPrice = 0;
            String selectedFood = "";

            switch (c) {
                case 1:
                    selectedFood = "Masala Chai";
                    selectedPrice = priceMasalaChai;
                    
                    break;
                case 2:
                    selectedFood = "Lassi";
                    selectedPrice = priceLassi;
                    break;
                case 3:
                    selectedFood = "Mango Lassi";
                    selectedPrice = priceMangoLassi;
                    break;
                case 4:
                    selectedFood = "Rose Lassi";
                    selectedPrice = priceRoseLassi;
                    break;
                case 5:
                    selectedFood = "Chole Bhature";
                    selectedPrice = priceCholeBhature;
                    break;
                case 6:
                    selectedFood = "Paneer Tikka";
                    selectedPrice = pricePaneerTikka;
                    break;
                case 7:
                    selectedFood = "Aloo Paratha";
                    selectedPrice = priceAlooParatha;
                    break;
                case 8:
                    selectedFood = "Veg Burger";
                    selectedPrice = priceVegBurger;
                    break;
                case 9:
                    selectedFood = "Pasta";
                    selectedPrice = pricePasta;
                    break;
                case 10:
                    selectedFood = "Samosa";
                    selectedPrice = priceSamosa;
                    break;
                case 11:
                    selectedFood = "Fried Rice";
                    selectedPrice = priceFriedRice;
                    break;
                case 12:
                    selectedFood = "Dal Makhani";
                    selectedPrice = priceDalMakhani;
                    break;
                case 13:
                    selectedFood = "Garlic Naan";
                    selectedPrice = priceGarlicNaan;
                    break;
                case 14:
                    selectedFood = "Vegetable Biryani";
                    selectedPrice = priceVegetableBiryani;
                    break;
                case 15:
                    selectedFood = "Paneer Butter Masala";
                    selectedPrice = pricePaneerButterMasala;
                    break;
                case 16:
                    selectedFood = "Roti";
                    selectedPrice = priceRoti;
                    break;
                case 17:
                    selectedFood = "Gulab Jamun";
                    selectedPrice = priceGulabJamun;
                    break;
                default:
                    System.out.println("Wrong Choice");
                    continue; 
            }

           
            System.out.println("You selected " + selectedFood + " which costs " + selectedPrice + " Rs.");
            System.out.print("How much quantity would you like? ");
            int quantity = sc.nextInt();
            int totalCost = selectedPrice * quantity;
            System.out.println("Total cost for " + quantity + " " + selectedFood + "(s): " + totalCost + " Rs");

            System.out.println();
            System.out.println("Press 0 for More Orders or any other key to exit.");
            choice = sc.nextInt();

        } while (choice == 0); 

        System.out.println("Thank you for dining with us!");
        sc.close();
    }
}
