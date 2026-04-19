package CH_3_Conditional_Statement;

import java.util.Scanner;

public class _8_Income_Tax_Calculator {
    public static void main(String[] args) {
        System.out.println("If income is less than 5L then 0% tax" +
                " If income between 5L to 10L then 20% tax" +
                " If income is greater than 10L then 30% tax");
        System.out.println("Income tax calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income:");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
            System.out.println("Your tax is zero.");
        }
        else if ( income >= 500000 && income < 1000000) {
            tax = (int)(income * 0.2);
            System.out.println("Your tax is:"+tax);
        }
        else {
            tax = (int) (income * 0.3);
        }
    }
}
