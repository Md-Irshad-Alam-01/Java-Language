package CH_11_Strings;

import java.util.Scanner;

public class _3_sc_nextLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = sc.nextLine(); // this can print entire sentence
        System.out.println("Your name is " +name);
    }
}
