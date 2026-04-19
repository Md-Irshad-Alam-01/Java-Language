package CH_14_Recurision_Basics;

public class _PW_13_Find_Greatest_Common_Divisor_i {
    public static int findGreatestCommonDivisor ( int x , int y) {

        //Long division method
        while (  x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static void main(String[] args) {
        int x = 24;
        int y = 15;
        System.out.println(findGreatestCommonDivisor(x,y));
    }
}
