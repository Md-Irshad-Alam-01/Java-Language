package CH_16_Time_And_Space_Complexity;

public class _06_Fibonacci_Number {
    public static int fibonacci ( int num ) {
        if ( num == 0 || num == 1) {
            return num;
        }
        return fibonacci(num -1) + fibonacci(num-2);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println(fibonacci(num1));
        System.out.println(fibonacci(num2));
    }
}

// time complexity = O(2^n)
//space complexity = O(n)