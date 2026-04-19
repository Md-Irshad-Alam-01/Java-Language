package CH_13_OOPs;

class Animal3 {
    void eat () {
        System.out.println("Animal eats.");
    }
}

class Deer extends Animal3 {
    void eat () {
        System.out.println("Deer eats.");
    }
}

public class _16_Method_Overriding_Run_Time_Polymorphism {
    public static void main(String[] args) {

        Deer deer = new Deer();
        deer.eat();
    }
}
