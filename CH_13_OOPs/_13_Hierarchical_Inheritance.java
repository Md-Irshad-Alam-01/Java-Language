package CH_13_OOPs;

//parent class
class Animal1 {
    void eat () {
        System.out.println("Animal Eats.");
    }
    void breath () {
        System.out.println("Animal breadth.");
    }
}

//child class 1
class Dog extends Animal1 {
    void bark (){
        System.out.println("Dog barks.");
    }
    void walk () {
        System.out.println("Dog walks.");
    }
}

//child class 2
class Cat extends Animal1 {
    void meow () {
        System.out.println("Cats meow..");
    }
    void cute () {
        System.out.println("Cats are cute.");
    }
}


public class _13_Hierarchical_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.breath();
        dog.bark();
        dog.walk();

        Cat cat = new Cat();
        cat.eat();
        cat.breath();
        cat.meow();
        cat.cute();
    }
}
