package CH_14_Recurision_Basics;

public class _PW_2_Print_Natural_Number_N_to_1 {
    public static void printNaturalNumber ( int num ) {

        //Base case
        if ( num == 1 ) {
            System.out.print(1);
            return;
        }

        System.out.print(num +" ");
        printNaturalNumber(num-1);
    }

    public static void main(String[] args) {
        int num = 10;
        printNaturalNumber(num);
    }
}
