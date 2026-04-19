package CH_7_Pattern_Part_ii;

public class _4_Floyd_Triangle {
    public static void FloydTriangle ( int num ) {
        int counter = 1;
        for ( int i = 1; i <= num; i++) {
            for ( int j =1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FloydTriangle(5);
    }
}
