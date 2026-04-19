package CH_14_Recurision_Basics;

public class _PW_5_Fibonacci_Number_ii {
    public static int findFibonacciNumber ( int num ) {

        //Base case
        if ( num == 0 || num == 1) {
            return num ;
        }

        return findFibonacciNumber(num - 1) + findFibonacciNumber(num - 2);
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(findFibonacciNumber(num));
        System.out.println(findFibonacciNumber(6));
    }
}
