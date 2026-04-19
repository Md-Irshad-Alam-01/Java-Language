package CH_13_OOPs;

class Pencil {
    private String colour ;
    private int tip;

    //Setters  : to modify the value

    void setColour (String newColour) {
        this.colour = newColour;
    }
    // this : this keyboard is used to refer to the current object
    void setTip ( int newTip) {
        this.tip = newTip;
    }

    //Getters : to return the value

    String getColour () {
        return this.colour;
    }
    int getTip () {
        return this.tip;
    }
}


public class _4_Getter_And_Setter {
    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        p1.setColour("Blue");
        System.out.println(p1.getColour());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
