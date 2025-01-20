abstract class Appliance {
    String brand;
    boolean isOn;

    Appliance(String brand) {
        this.brand = brand;
        this.isOn = false;
    }

    abstract void operate();

    void turnOn() {
        isOn = true;
        System.out.println("The appliance is now ON.");
    }

    void turnOff() {
        isOn = false;
        System.out.println("The appliance is now OFF.");
    }
}

class WashingMachine extends Appliance {
    WashingMachine(String brand) {
        super(brand);
    }


    void operate() {
        System.out.println("The washing machine is washing clothes.");
    }
}

class Refrigerator extends Appliance {
    Refrigerator(String brand) {
        super(brand);
    }

 
    void operate() {
        System.out.println("The refrigerator is cooling items.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Washing Machine:");
        WashingMachine wm = new WashingMachine("LG");
        wm.turnOn();
        wm.operate();
        wm.turnOff();

        System.out.println("\nRefrigerator:");
        Refrigerator fridge = new Refrigerator("Samsung");
        fridge.turnOn();
        fridge.operate();
        fridge.turnOff();
    }
}
