package CH_4_Loops;

public class _16_Continue_Statement {
    public static void main(String[] args) {
        for ( int i = 0; i <= 10; i++) {
            if ( i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
