package CH_4_Loops;

import java.util.Scanner;

public class _5_Print_Number_From_1_to_N_By_User_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range = ");
        int range = sc.nextInt();
        int count = 1;
        while (count <= range) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
    }
}
