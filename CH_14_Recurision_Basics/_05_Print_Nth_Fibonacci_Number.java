package CH_14_Recurision_Basics;

public class _5_Print_Nth_Fibonacci_Number {
    public static int printFibonacciNumber ( int num ) {

        //Base case
        if ( num == 0 || num == 1 ) {
            return num;
        }

        //Recursive call
        int prevSum = printFibonacciNumber(num - 1);

        int fibonacciSum = prevSum + printFibonacciNumber(num - 2);
        return fibonacciSum;
    }

    public static void main(String[] args) {
        int num = 6 ;
        System.out.println(printFibonacciNumber(num));
    }
}
