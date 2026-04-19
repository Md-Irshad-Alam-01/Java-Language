package CH_1_Variables_And_Datatypes;

import java.util.Scanner;

public class _28_Practice_Question_1 {
    public static void main(String[] args) {
        System.out.println("In a program, input 3 numbers: A, B and C." +
                "You have to output the average of these 3 numbers ");
        System.out.println("Enter three number:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();
        System.out.print("Enter C:");
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("Your average of these 3 number is:"+ average);
    }
}
