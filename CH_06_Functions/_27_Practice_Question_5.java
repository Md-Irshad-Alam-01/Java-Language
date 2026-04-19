package CH_6_Functions;

import java.util.Scanner;

public class _27_Practice_Question_5 {
    public static int sum ( int num) {
        int lastDigitSum = 0;
        while ( num > 0) {
            int lastDigit = num % 10;
            lastDigitSum += lastDigit;
            num /= 10;
        }
        return lastDigitSum;
    }

    public static void main(String[] args) {
        System.out.println("Write a Java method to compute the sum of the digits in an integer");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        System.out.println("Your sum of the digit is = " + sum(num));
    }
}
