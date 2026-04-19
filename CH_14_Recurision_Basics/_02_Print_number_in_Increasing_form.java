package CH_14_Recurision_Basics;

public class _2_Print_number_in_Increasing_form {
    public static void printIncreasingNumber ( int num ) {

        // Base case
        if ( num == 1) {
            System.out.print(num+" ");
            return;
        }

        // Current function call
        printIncreasingNumber(num - 1);

        //Inner function call
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        int num = 10;
        printIncreasingNumber(num);
    }
}
