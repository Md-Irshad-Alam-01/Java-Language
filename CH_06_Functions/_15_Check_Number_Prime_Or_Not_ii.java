package CH_6_Functions;

public class _15_Check_Number_Prime_Or_Not_ii {
    public static boolean isPrime ( int num) {
        for ( int i =2; i <= num-1; i++) {
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
