package CH_13_OOPs;

// Base class
class Animal {
    String colour;

    void eat() {
        System.out.println("Animal eats.");
    }

    void breathe() {
        System.out.println("Animal breathes...");
    }
}

// Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Fish swims in water.");
    }
}

public class _10_Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}
