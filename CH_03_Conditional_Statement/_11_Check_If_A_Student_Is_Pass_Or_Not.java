package CH_3_Conditional_Statement;

import java.util.Scanner;

public class _11_Check_If_A_Student_Is_Pass_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks = sc.nextInt();
        String result =( marks >= 33  ? "Pass" : "Fail");
        System.out.println(result);
    }
}
