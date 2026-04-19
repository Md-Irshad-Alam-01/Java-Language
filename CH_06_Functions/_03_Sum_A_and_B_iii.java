package CH_6_Functions;

import java.util.Scanner;

public class _3_Sum_A_and_B_iii {
    public static void PrintSum ( int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num a = ");
        int a = sc.nextInt();
        System.out.print("Enter num b = ");
        int b = sc.nextInt();
        PrintSum(a,b);
    }
}
