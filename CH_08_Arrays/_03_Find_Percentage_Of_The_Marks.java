package CH_8_Arrays;
import java.util.Scanner;

public class _3_Find_Percentage_Of_The_Marks {
    public static void main(String[] args) {
        System.out.println("You have to find percentage of these marks :");
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[6];
        System.out.print("Enter mathematics marks = ");
        marks [0] = sc.nextInt();
        System.out.print("Enter physics marks = ");
        marks [1]= sc.nextInt();
        System.out.print("Enter chemistry marks = ");
        marks [2] = sc.nextInt();
        System.out.print("Enter fine arts marks = ");
        marks[3] = sc.nextInt();
        System.out.print("Enter english marks = ");
        marks[4] = sc.nextInt();
        System.out.print("Enter urdu marks = ");
        marks[5] = sc.nextInt();
        double percentage = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4] + marks[5] ) / 6.0;
        System.out.println("Your percentage of the marks is = "+ percentage);
    }
}
