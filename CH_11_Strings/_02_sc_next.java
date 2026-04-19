package CH_11_Strings;

import java.util.Scanner;

public class _2_sc_next {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = sc.next(); // this print only one word
        System.out.println("Your name is " +name);
    }
}
