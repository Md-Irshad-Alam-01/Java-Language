package CH_8_Arrays;

import java.util.Scanner;

public class _1_Input_And_Output_i {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Your physics marks is = " + marks[0]);
        System.out.println("Your chemistry marks is = " + marks[1]);
        System.out.println("Your mathematics marks is = " + marks[2]);
    }

}
