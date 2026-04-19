package CH_3_Conditional_Statement;

public class _9_Print_The_Largest_Of_Three {
    public static void main(String[] args) {
        int a = 51;
        int b = 18;
        int c = 10;
        if ( a > b && a > c) {
            System.out.println("A is largest.");
        }
        else if ( b > a && b > c) {
            System.out.println("B is largest.");
        }
        else {
            System.out.println("C is largest.");
        }
    }
}
