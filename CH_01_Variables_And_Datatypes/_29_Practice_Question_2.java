package CH_1_Variables_And_Datatypes;

import java.util.Scanner;

public class _29_Practice_Question_2 {
    public static void main(String[] args) {
        System.out.println("In a program, input the side of a square . You have to output the area of the square.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square:");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Your area of the square is :"+area);
    }
}
