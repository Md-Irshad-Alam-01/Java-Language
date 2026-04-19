package CH_14_Recurision_Basics;

public class _3_Print_Factorial_of_Number {
    public static int printFactorial ( int num ) {

        // Base case
        if ( num == 0  ) {
            return 1;
        }

        //Recursive call
        int factNumMinus1 = printFactorial(num - 1);

        //Inner function call
        int fact = num * factNumMinus1;

        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(printFactorial(num));
    }
}

// Time complexity = O(n)
// Space complexity = O(n)