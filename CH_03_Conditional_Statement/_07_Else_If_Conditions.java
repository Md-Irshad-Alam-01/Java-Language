package CH_3_Conditional_Statement;

import java.util.Scanner;

public class _7_Else_If_Conditions {
    public static void main(String[] args) {
        System.out.println("Check adult, teenager and not adult:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        if ( age >= 18 ){
            System.out.println("You are adult.");
        }
        else if ( age >= 13 && age < 18) {
            System.out.println("You are teenager.");
        }
        else {
            System.out.println("You are not adult.");
        }
    }
}
