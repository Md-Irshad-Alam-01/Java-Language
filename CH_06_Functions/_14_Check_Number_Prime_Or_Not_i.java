package CH_6_Functions;

public class _14_Check_Number_Prime_Or_Not_i {
    public static boolean isPrime ( int num) {
        boolean isPrime = true;
        for ( int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(56));
    }
}
