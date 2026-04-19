package CH_1_Variables_And_Datatypes;

import java.util.Scanner;

public class _18_Input_Area_Of_Circle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         float rad = sc.nextFloat();
         float pi = 3.14f;
         float area = pi * rad * rad;
         System.out.println(area);
    }
}
