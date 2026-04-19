package CH_13_OOPs;

class Pen {
    String colour ;
    int tip;
    void setColour (String newColour) {
        colour = newColour;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

public class _1_Class_and_Objects {
    public static void main(String[] args) {
        Pen p1 =  new Pen();
        p1.setColour("Blue");
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.colour= "Yellow";
        System.out.println(p1.colour);
    }
}
