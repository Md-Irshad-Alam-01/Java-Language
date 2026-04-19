package CH_3_Conditional_Statement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _2_Use_Scanner_Adult_Or_Not {
    public static void main(String[] args) {
        System.out.println("Check adult or not:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        if ( age >= 18) {
            System.out.println("Your are adult.");
        }
        else {
            System.out.println("Your are not adult");
        }
    }
}
