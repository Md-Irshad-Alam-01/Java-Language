package CH_14_Recurision_Basics;

public class _PW_4_Fibonacci_Number_i {
    public static int findFibonacci ( int num ) {

        //Base case
        if ( num == 0 || num == 1) {
            return num;
        }

        int fibonacciNumMinus1 = findFibonacci(num - 1);
        int fibonacciNumMinus2 = findFibonacci(num - 2);

        int fibonacci = fibonacciNumMinus1 + fibonacciNumMinus2;

        return fibonacci;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(findFibonacci(num));
    }
}
