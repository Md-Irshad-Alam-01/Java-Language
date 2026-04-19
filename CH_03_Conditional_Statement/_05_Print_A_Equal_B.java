package CH_3_Conditional_Statement;

public class _5_Print_A_Equal_B {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        if ( a == b) {
            System.out.println("A and B are equal.");
        }
        else if (a > b) {
            System.out.println("A is largest.");
        }
        else {
            System.out.println("B is largest.");
        }
    }
}
