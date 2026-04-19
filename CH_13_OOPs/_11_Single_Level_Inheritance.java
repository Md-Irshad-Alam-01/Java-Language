package CH_13_OOPs;

class Mammal {
    void eat() {
        System.out.println("Mammal eats.");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("Human speaks.");
    }
}

public class _11_Single_Level_Inheritance {
    public static void main(String[] args) {
        Human person = new Human();
        person.eat();
        person.speak();
    }
}
