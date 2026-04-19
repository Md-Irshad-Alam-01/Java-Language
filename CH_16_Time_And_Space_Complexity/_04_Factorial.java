package CH_16_Time_And_Space_Complexity;

public class _04_Factorial {
    public static int factorial ( int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return num *  factorial(num - 1);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        System.out.println(factorial(num1));
        System.out.println(factorial(num2));
    }
}

// time complexity = O(n)