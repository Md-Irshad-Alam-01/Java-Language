package CH_13_OOPs;

//Abstraction means hiding all the unnecessary details and showing
//only the important parts of the user.

import java.util.concurrent.Callable;

abstract class Animal4 {
    void eat () {
        System.out.println("Animal eats.");
    }
    abstract void walk();
}

class Horse extends Animal4 {
    void walk () {
        System.out.println("Horse walks.");
    }
}

class Chicken extends Animal4 {
    void walk () {
        System.out.println("Chicken walks,");
    }
}


public class _18_Abstract_Class {
    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.eat();
        horse.walk();
        System.out.println();

        Chicken chicken = new Chicken();
        chicken.walk();
        chicken.eat();
    }
}
