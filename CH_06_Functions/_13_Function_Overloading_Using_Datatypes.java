package CH_6_Functions;

public class _13_Function_Overloading_Using_Datatypes {
    public static int sum ( int a, int b) {
        return a+ b;
    }
    public static float sum ( float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,8));
        System.out.println(sum(5.2f,8.8f,6.5f));
    }
}
