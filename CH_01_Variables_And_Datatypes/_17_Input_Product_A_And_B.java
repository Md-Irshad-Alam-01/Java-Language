package CH_1_Variables_And_Datatypes;

import java.util.Scanner;

public class _17_Input_Product_A_And_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println(product);
    }
}
