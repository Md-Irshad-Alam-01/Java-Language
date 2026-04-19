package CH_12_Bit_Manipulation;

public class _7_Even_Or_Odd {
    public static void EvenOdd ( int num ) {
        int bitmask = 1;
        if ( (num & bitmask) == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        EvenOdd(5);
        EvenOdd(6);
        EvenOdd(11);
    }
}
