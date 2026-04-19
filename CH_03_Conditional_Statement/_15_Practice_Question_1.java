package CH_3_Conditional_Statement;

import java.util.Scanner;

public class _15_Practice_Question_1 {
    public static void main(String[] args) {
        System.out.println("Write a java program to get a number form the" +
                " user and print whether it is positive or not.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        if ( num == 0 ) {
            System.out.println("Number is positive.");
        }
        else if ( num > 0 ) {
            System.out.println("Number is positive.");
        }
        else {
            System.out.println("Number is negative.");
        }
    }
}
