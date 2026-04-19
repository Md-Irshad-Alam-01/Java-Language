package CH_6_Functions;

public class _6_By_Function_Method_Swapping {
    public static void Swapping (int a , int b ) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Your swapping value of a is = " +a);
        System.out.println("Your swapping value of b is = " +b);
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        Swapping(a,b);
    }
}
