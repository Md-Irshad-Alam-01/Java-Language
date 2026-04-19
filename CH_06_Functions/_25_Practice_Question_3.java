package CH_6_Functions;

import java.util.Scanner;

public class _25_Practice_Question_3 {
    public static int isPalindrome ( int num ) {
        int lastDigit ;
        int rev = 0;
         while ( num > 0) {
             lastDigit = num % 10;
             rev = (rev * 10 ) + lastDigit;
             num /= 10;
         }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        if ( num == isPalindrome(num)) {
            System.out.println("This number is palindrome");
        }
        else {
            System.out.println("This number is not palindrome.");
        }
    }
}
