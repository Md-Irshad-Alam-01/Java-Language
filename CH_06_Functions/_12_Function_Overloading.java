package CH_6_Functions;

public class _12_Function_Overloading {
    public static int sum (int a, int b) {
        return a+b;
    }
    public static int sum ( int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,8));
        System.out.println(sum(5,6,8));
    }
}
//In Function overloading
//      Multiple functions with same name but different parameters

