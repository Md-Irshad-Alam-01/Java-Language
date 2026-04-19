package CH_13_OOPs;

abstract class Animal6 {
    String colour ;
    Animal6 () {
        System.out.println("Animal constructor called");
    }
    void eat () {
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse2 extends Animal6 {
    Horse2 () {
        System.out.println("Horse constructor are called  ");
    }
    void walk () {
        System.out.println("Horse walks on 4 legs.");
    }
}

class Mustang extends Horse2 {
    Mustang () {
        System.out.println("Mustang constructor called..");
    }
}


public class _20_Abstract_Class_Constructor_ii {
    public static void main(String[] args) {
       Mustang myHorse = new Mustang();
    }
}
