package CH_6_Functions;

import java.util.Scanner;

public class _24_Practice_Question_2 {
    public static boolean EvenOdd ( int num ) {
        if ( num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(" Write a method named isEven that accepts an int argument. The method\n" +
                " should return true if the argument is even, or false otherwise. Also write a program to test your\n" +
                " method");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = " );
        int num = sc.nextInt();
        if (EvenOdd(num )) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
