package CH_6_Functions;

public class _16_Check_Number_Prime_Or_Not_iii {
    public static boolean isPrime ( int num) {
        //corner case
        //only for num >= 2
        if ( num == 2) {
            return true;
        }
        for ( int i = 2; i <= num -1 ; i++) {
            if ( num % i == 0) {
                return false ;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
