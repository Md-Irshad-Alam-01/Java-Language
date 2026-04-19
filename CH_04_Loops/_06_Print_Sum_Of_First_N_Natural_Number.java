package CH_4_Loops;

import java.util.Scanner;

public class _6_Print_Sum_Of_First_N_Natural_Number {
    public static void main(String[] args) {
        System.out.print("Enter number = ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int count = 1;
        while ( count <= number) {
            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
