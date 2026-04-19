package CH_6_Functions;

import java.util.Scanner;

public class _9_Factorial_Of_A_Number {
    public static int FindFactorial (int num) {
        int fact = 1;
        if ( num == 0 || num == 1) {
            //System.out.println("Factorial of this number is = 1");
            return 1;
        }
        for (int i = 2; i <= num ; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Find the factorial of the num number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        System.out.println("Your factorial of the number is = "+(FindFactorial(num)));
    }
}
