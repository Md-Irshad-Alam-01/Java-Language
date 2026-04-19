package CH_3_Conditional_Statement;

import java.util.Scanner;

public class _6_Print_Number_Is_Even_And_Odd {
    public static void main(String[] args) {
        System.out.println("Print if a number is even or not.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("This number is even.");
        }
        else {
            System.out.println("This number is odd.");
        }
    }
}
