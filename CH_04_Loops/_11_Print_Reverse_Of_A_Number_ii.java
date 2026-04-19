package CH_4_Loops;

import java.util.Scanner;

public class _11_Print_Reverse_Of_A_Number_ii {
    public static void main(String[] args) {
        System.out.println("Reverse a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while ( num > 0) {
            int lastDigit = num % 10;
            rev = ( rev * 10 ) + lastDigit;
            num /= 10;
        }
        System.out.println(rev);
    }
}
