package CH_6_Functions;

import java.util.Scanner;

public class _3_Sum_A_and_B_Use_Scanner_ii {
    public static void printSum () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A = ");
        int a = sc.nextInt();
        System.out.print("Enter number B = ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Your sum is = " +sum);
    }

    public static void main(String[] args) {
        printSum();
    }
}
