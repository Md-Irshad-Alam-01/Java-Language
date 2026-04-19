package CH_4_Loops;

public class _10_Print_Reverse_Of_A_Number_i {
    public static void main(String[] args) {
        int num = 32153;
        while ( num > 0) {
            int lastDigit = num % 10 ;
            System.out.print(lastDigit);
            num /= 10;
        }
        System.out.println();
    }
}
