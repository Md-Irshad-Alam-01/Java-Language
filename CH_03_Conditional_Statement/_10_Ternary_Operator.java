package CH_3_Conditional_Statement;

public class _10_Ternary_Operator {
    public static void main(String[] args) {
        int number = 4;
        //ternary operator
        String type = ((number % 2) ==0) ? "Even" : "Odd";
        System.out.println(type);
    }
}
