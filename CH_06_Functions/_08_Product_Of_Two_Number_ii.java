package CH_6_Functions;

import java.util.Scanner;

public class _8_Product_Of_Two_Number_ii {
    public static int CalculateProduct (int a, int b) {
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b = sc.nextInt();
        int prod = CalculateProduct(a,b);
        System.out.println("Your product of two number is = " +prod);
        prod = CalculateProduct(10,20);
        System.out.println("Your 2nd product of two number is = " +prod);
    }

}
