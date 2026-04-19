package CH_6_Functions;

public class _17_Check_Number_Prime_Or_Not_iv {
    public static boolean isPrime ( int num ) {
        if ( num == 2) {
            return true;
        }
        for ( int i = 2; i <= num -2; i++) {
            if ( num % i == 0) {
                return false ;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(56));
    }
}
