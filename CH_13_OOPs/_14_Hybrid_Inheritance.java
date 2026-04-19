package CH_13_OOPs;

class Animal2 {
    void eat () {
        System.out.println("Animal eats.");
    }
    void walk () {
        System.out.println("Animal walks.");
    }
}

class Fish1 extends Animal2 {
   void swim () {
       System.out.println("Fish swims.");
   }
}

class Shark extends Fish1 {
    void info () {
        System.out.println("Shark is very big.");
    }
}

class Tuna extends Fish1 {
    void info () {
        System.out.println("Tuna is small type of fish.");
    }
}

class Bird extends Animal2 {
   void fly () {
       System.out.println("Birds can fly");
   }
}

class Peacock extends Bird {
    void info () {
        System.out.println("Peacock is very beautiful.");
    }
}

class Sparrow extends Bird {
    void info () {
        System.out.println("Sparrow is small bird.");
    }
}

class Mammal1 extends Animal2 {
    void run () {
        System.out.println("Mammals can run.");
    }
}

class Dog1 extends Mammal1 {
    void bark () {
        System.out.println("Dog barks.");
    }
}

class Cat1 extends Mammal1 {
    void meow () {
        System.out.println("Cat meow.");
    }
}

class Humans extends  Mammal1 {
    void talk () {
        System.out.println("Humans can talk.");
    }
}



public class _14_Hybrid_Inheritance {
    public static void main(String[] args) {
        Humans humans = new Humans();
        humans.talk();
        humans.eat();
        humans.run();
        humans.walk();
        System.out.println();

        Cat1 cat = new Cat1();
        cat.meow();
        cat.eat();
        cat.walk();
        cat.run();
        System.out.println();

        Dog1 dog = new Dog1();
        dog.bark();
        dog.eat();
        dog.run();
        dog.walk();
        System.out.println();

        Sparrow sparrow = new Sparrow();
        sparrow.info();
        sparrow.fly();
        sparrow.eat();
        System.out.println();

        Peacock peacock = new Peacock();
        peacock.info();
        peacock.eat();
        peacock.walk();
        System.out.println();

        Tuna tuna = new Tuna();
        tuna.info();
        tuna.eat();
        tuna.swim();
        System.out.println();

        Shark shark = new Shark();
        shark.info();
        shark.eat();
        shark.swim();

    }
}
