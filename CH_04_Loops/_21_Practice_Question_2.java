package CH_4_Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class _21_Practice_Question_2 {
    public static void main(String[] args) {
        System.out.println(" Write a program that reads a set of integers,and then prints the sum of the\n" +
                " even and odd integers.");
        Scanner sc = new Scanner(System.in);
        int num;
        int choice ;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter number = ");
            num = sc.nextInt();
            if ( num % 2 == 0) {
                evenSum+=num;
            }
            else {
                oddSum+=num;
            }
            System.out.println("Do you want to continue press 1 and if you" +
                    " want to stop press 0");
            choice = sc.nextInt();
        }
        while (choice == 1);
        System.out.println("your even sum is = " +evenSum);
        System.out.println("Your odd sum is = "+ oddSum);
    }
}
