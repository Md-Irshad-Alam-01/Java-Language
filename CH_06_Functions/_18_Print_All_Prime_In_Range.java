package CH_6_Functions;

public class _18_Print_All_Prime_In_Range {
    public static boolean isPrime ( int num ) {
        if ( num == 2){
            return true;
        }
        for ( int i = 2; i <= num - 1; i++) {
            if ( num % i == 0 ) {
                return false ;
            }
        }
        return true;
    }

    public static void PrimeInRange ( int num) {
        for ( int i = 2; i <= num ; i++) {
            if ( isPrime(i)) {
                System.out.print(i +" , ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimeInRange(10);
    }
}
