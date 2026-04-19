package CH_1_Variables_And_Datatypes;

public class _25_Type_Promotion_ii {
    public static void main(String[] args) {
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a+b+c);
        System.out.println(bt);
    }
}
