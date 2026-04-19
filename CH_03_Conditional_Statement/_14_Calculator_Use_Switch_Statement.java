package CH_3_Conditional_Statement;

import java.util.Scanner;

public class _14_Calculator_Use_Switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();
        System.out.print("Enter operator:");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' : System.out.println("Addition : "+ (a+b));
            break;
            case '-' : System.out.println("Subtraction : "+ (a-b));
            break;
            case '*' : System.out.println("Multiplication : " + (a*b));
            break;
            case '/' : System.out.println("Division : "+ (a/b));
            break;
            case '%' : System.out.println("Modulo :" + (a%b));
            break;
            default: System.out.println("Input is not valid.");
        }
    }
}
