package CH_3_Conditional_Statement;

public class _13_Break_Statement_In_Switch_Statement {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 1 : System.out.println("Samosa");
            break;
            case 2 : System.out.println("Burger");
            break;
            case 3 : System.out.println("Mango Shake");
            break;
            default : System.out.println("Nothing");
        }
    }
}
// We can use same as char, float, double , long as int