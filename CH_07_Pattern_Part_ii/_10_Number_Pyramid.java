package CH_7_Pattern_Part_ii;

public class _10_Number_Pyramid {
    public static void NumberPyramid(int num ) {
        for ( int i = 1; i <= num ; i++) {
            for ( int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for ( int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberPyramid(5);
    }
}
