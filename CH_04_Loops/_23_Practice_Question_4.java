package CH_4_Loops;

import java.util.Scanner;

public class _23_Practice_Question_4 {
    public static void main(String[] args) {
        System.out.println(" Write a program to print the multiplication table of a number N,entered by the\n" +
                " user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        for ( int i = 1 ; i <= 10 ; i++) {
            System.out.println(num + "*" + i + "=" + num *i);
        }
    }
}
