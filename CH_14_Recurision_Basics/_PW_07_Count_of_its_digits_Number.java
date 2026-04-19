package CH_14_Recurision_Basics;

public class _PW_7_Count_of_its_digits_Number {
    public static int countOfItsDigitNumber ( int num ) {

        //Base case
        if ( num >= 0 && num <= 9) {
            return 1;
        }

        int remainingNumber = num / 10;

        int smallAns = countOfItsDigitNumber(remainingNumber);

        return 1 + smallAns;

    }

    public static void main(String[] args) {
        int num = 02344;
        System.out.println(countOfItsDigitNumber(num));
    }
}
