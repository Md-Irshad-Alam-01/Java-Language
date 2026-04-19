package CH_4_Loops;

import java.util.Scanner;

public class _15_Keep_Entering_Num_Until_Multiple_Of_10_ii {
    public static void main(String[] args) {
        System.out.println("Use Break statement and keep entering number till user " +
                " enters a multiple of 10");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number = ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
        }
        while (true);
    }
}
