package CH_13_OOPs;

//In Java multiple inheritance can't work directly
//Java allow multiple inheritance with interfaces.

interface Herbivores {
    void eat ();
}

interface Carnivores {
    void eat ();
}

class Bear implements Herbivores,Carnivores {
    public void eat () {
        System.out.println("Bear are both carnivores and herbivores.");
    }
}


public class _22_Multiple_Inheritance {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eat();
    }
}