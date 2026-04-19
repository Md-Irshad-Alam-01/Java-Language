package CH_4_Loops;

import java.util.Scanner;

public class _18_Display_All_Num_Entered_by_User_Except_Multiple_of_10_ii {
    public static void main(String[] args) {
        System.out.println("Display all numbers entered by user except multiples of 10.");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number = ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println("Your number is = "+num);
        }
        while (true);
    }
}
