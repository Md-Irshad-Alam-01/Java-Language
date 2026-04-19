package CH_4_Loops;

import java.util.Scanner;

public class _22_Practice_Question_3 {
    public static void main(String[] args) {
        System.out.println("Write a program to find the factorial of any number entered by the user.");
        System.out.print("Enter number = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ( num == 0 || num == 1 ) {
            System.out.println("Your factorial is = 1");
        }
        int fact = 1;
        if ( num >= 2) {
            for ( int i = 2; i <= num  ; i++) {
                fact = fact * i;
            }
            System.out.println("Your factorial is = "+fact);
        }
        else {
            System.out.println("Please enter a positive number ");
        }
    }
}
