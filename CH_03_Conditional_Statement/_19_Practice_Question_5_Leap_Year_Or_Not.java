package CH_3_Conditional_Statement;

import java.util.Scanner;

public class _19_Practice_Question_5_Leap_Year_Or_Not {
    public static void main(String[] args) {
        System.out.println(" Write a Java program that takes a year from the user and print whether that \n" +
                " year is a leap year or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year = ");
        int year = sc.nextInt();
        if (( year % 4 == 0 && year % 100 != 0)  || year % 400 == 0 ) {
            System.out.println("This year is leap year.");
        }
        else {
            System.out.println("This is not a leap year.");
        }
    }
}
