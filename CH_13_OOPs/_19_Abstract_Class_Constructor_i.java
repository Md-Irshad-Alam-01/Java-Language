package CH_13_OOPs;

abstract  class Animal5 {
    String colour ;
    Animal5 () {
        colour = "brown";
    }
    void eat () {
        System.out.println("Animals eats.");
    }
    abstract void walk();
}

class Horse1 extends Animal5 {
    void changeColour () {
        colour = "Dark brown";
    }
    void walk () {
        System.out.println("Walks on 4 legs.");
    }
}

class Chicken1 extends Animal5 {
    void changeColour () {
        colour  = "Yellow Green";
    }
    void walk () {
        System.out.println("Walks on 2 legs");
    }
}


public class _19_Abstract_Class_Constructor_i {
    public static void main(String[] args) {
        Chicken1 chicken = new Chicken1();
        chicken.eat();
        chicken.walk();
        System.out.println(chicken.colour);

        Horse1 horse = new Horse1();
        horse.eat();
        horse.walk();
        System.out.println(horse.colour);
    }
}
