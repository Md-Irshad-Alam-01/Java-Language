package CH_13_OOPs;

class Animal7 {
    String colour;
    Animal7 () {
        System.out.println("Animal Constructor is called");
    }
}

class Horse3 extends Animal7 {
    Horse3 () {
        super ();
        super.colour= "Brown";
        System.out.println("Horse constructor is called");
    }
}

public class _24_Super_Keyboard {
    public static void main(String[] args) {
        Horse3 horse = new Horse3();
        System.out.println(horse.colour);
    }
}
