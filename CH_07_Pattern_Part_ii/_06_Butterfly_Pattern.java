package CH_7_Pattern_Part_ii;

public class _6_Butterfly_Pattern {
    public static void ButterflyPattern (int num) {
        for ( int i = 1 ; i <= num ; i++) {
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for ( int j = 1; j <= 2*(num -i) ; j++){
                System.out.print(" ");
            }
            for ( int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int i = num; i >=1; i--) {
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for ( int j = 1 ; j <= 2*(num-i) ; j++) {
                System.out.print(" ");
            }
            for ( int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ButterflyPattern(5);
    }
}
