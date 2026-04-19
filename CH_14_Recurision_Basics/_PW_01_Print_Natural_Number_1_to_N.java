package CH_14_Recurision_Basics;

public class _PW_1_Print_Natural_Number_1_to_N {
    public static void printNaturalNumber ( int num ) {

        //Base case
        if ( num == 1) {
            System.out.print(num +" ");
            return;
        }

        printNaturalNumber(num - 1 );
        System.out.print(num +" ");
    }

    public static void main(String[] args) {
        int num = 15;
        printNaturalNumber(num);
    }
}
