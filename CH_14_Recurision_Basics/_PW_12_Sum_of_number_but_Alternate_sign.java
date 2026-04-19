package CH_14_Recurision_Basics;

public class _PW_12_Sum_of_number_but_Alternate_sign {
    public static int sumOfNumberButAlternateSign ( int num ) {

        //Base case
        if ( num == 0) {
            return 0;
        }

        if ( num % 2 == 0) {
            return sumOfNumberButAlternateSign(num - 1) - num;
        }
        else {
            return sumOfNumberButAlternateSign(num - 1) + num;
        }
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(sumOfNumberButAlternateSign(num));
    }
}
