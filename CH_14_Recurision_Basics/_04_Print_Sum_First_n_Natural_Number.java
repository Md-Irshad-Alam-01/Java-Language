package CH_14_Recurision_Basics;

public class _4_Print_Sum_First_n_Natural_Number {
    public static int sumFirstNaturalNumber ( int num ) {

        // Base case
        if ( num == 1) {
            return 1;
        }

        //Recursion call
        int sumMinus1 = sumFirstNaturalNumber( num - 1 );

        //Inner function call
        int sum = num + sumMinus1;

        return  sum;

    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(sumFirstNaturalNumber(num));
    }
}

//Time Complexity = O(n)
//Space complexity = O(n)
