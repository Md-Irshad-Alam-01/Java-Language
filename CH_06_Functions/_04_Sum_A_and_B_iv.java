package CH_6_Functions;

import java.util.Scanner;

public class _4_Sum_A_and_B_iv {
    public static int PrintSum ( int num1 , int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b = sc.nextInt();
        int sum = PrintSum(a,b);
        System.out.println("Your sum is = "+sum);
    }
}
