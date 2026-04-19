package CH_3_Conditional_Statement;

import java.util.Scanner;

public class _16_Practice_Question_2 {
    public static void main(String[] args) {
        System.out.println(": Finish the following code so that it prints. You have a fever if your temperature\n" +
                " is above 100 and otherwise prints You don't have a fever.");
        System.out.println("Enter temperature =");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if ( temp >= 100 ) {
            System.out.println("You have fever.");
        }
        else {
            System.out.println("You don't have fever");
        }
    }
}
