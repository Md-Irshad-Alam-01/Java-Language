package CH_7_Pattern_Part_ii;

public class _5_0_1_Triangle {
    public static void Triangle ( int num ){
        for ( int i = 1; i <= num; i++) {
            for (int j = 1 ; j <= i; j++){
                if ( (i+j) % 2== 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangle(5);
    }
}
