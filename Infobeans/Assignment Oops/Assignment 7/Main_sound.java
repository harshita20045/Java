class Animal {
    public void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    public void dogSound() {
        sound();
        System.out.println("Dogs bark");
    }
}

public class Main_sound {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.dogSound();
    }
}
