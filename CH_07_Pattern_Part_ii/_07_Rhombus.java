package CH_7_Pattern_Part_ii;

public class _7_Rhombus {
    public static void Rhombus ( int num) {
        for ( int i = 1; i <= num ; i++) {
            for ( int j = 1 ; j <= num-i; j++) {
                System.out.print(" ");
            }
            for ( int j = 1; j <= num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rhombus(5);
    }
}
