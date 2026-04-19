package CH_7_Pattern_Part_ii;

public class _3_Inverted_Half_Pyramid_With_Number {
    public static void InvertedHalfPyramid ( int num ) {
        for ( int i = 1; i <= num ; i++) {
            for ( int j = 1 ; j <= num-i+1 ; j ++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedHalfPyramid(5);
    }
}
