package CH_4_Loops;

import java.util.Scanner;

public class _19_Check_If_a_Number_Is_Prime_Or_Not {
    public static void main(String[] args) {
        System.out.println("Check if a number is prime or not:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        if ( num == 2) {
            System.out.println("This is prime number.");
        }
        else {
            boolean isPrime = true;
            for ( int i = 2; i < num-1; i++){
                // we can also use i <= Math.sqrt() instead of i < num - 1
                //i <= Math.sqrt() this is use for square root
                if(num % i ==0) {
                    isPrime = false;
                    //System.out.println("This number is not prime");
                }
            }
            if ( isPrime == true) {
                System.out.println("This number is prime");
            }
            else {
                System.out.println("This is not a prime number");
            }
        }

    }
}
