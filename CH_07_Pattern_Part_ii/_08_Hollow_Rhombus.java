package CH_7_Pattern_Part_ii;

public class _8_Hollow_Rhombus {
    public static void HollowRhombus ( int num ) {
        for ( int i = 1; i <= num ; i++) {
            for ( int j =1 ; j <= num -i; j++) {
                System.out.print(" ");
            }
            for ( int j =1 ; j <= num ; j++) {
                if ( i == 1 || j == 1 || i == num || j == num) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HollowRhombus(5);
    }
}
