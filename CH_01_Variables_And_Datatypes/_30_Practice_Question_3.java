package CH_1_Variables_And_Datatypes;

import java.util.Scanner;

public class _30_Practice_Question_3 {
    public static void main(String[] args) {
        System.out.println("Enter cost of 3 items from the user (using float data type) a pencil- a pen and an eraser." +
                " You have to output the total cost of the items back to the user as their bills." +
                "(Add on : You can also try adding 18% gst tax to the items in the bills as an advance problem)");
        System.out.println("Enter cost of 3 items:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pencil cost:");
        int pencil = sc.nextByte();
        System.out.print("Enter pen cost:");
        int pen = sc.nextByte();
        System.out.println("Enter eraser cost: ");
        int eraser = sc.nextByte();
        int totalCost = eraser+pen+pencil;
        System.out.println("Your total cost is :"+totalCost);
        float gst = (1f + 18f /100);
        float calGST = totalCost*gst;
        System.out.println("Your 18% gst tax will be :"+calGST);
    }
}
