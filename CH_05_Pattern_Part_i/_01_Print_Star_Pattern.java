package CH_5_Pattern_Part_i;

public class _1_Print_Star_Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
