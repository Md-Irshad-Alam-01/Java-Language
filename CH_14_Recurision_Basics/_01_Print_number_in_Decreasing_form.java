package CH_14_Recurision_Basics;

public class _1_Print_number_in_Decreasing_form {
    public static void printDecreasingNumber ( int num ) {
        // Base case
        if ( num == 1 ) {
            System.out.println(num);
            return;
        }

        // current function call
        System.out.print(num + " ");

        //Inner function call
        printDecreasingNumber(num - 1);
    }

    public static void main(String[] args) {
        int num = 10;
        printDecreasingNumber(num);
    }
}
