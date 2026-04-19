package CH_14_Recurision_Basics;

public class _10_Find_power_i {
    public static int power ( int num , int pow) {

        if ( pow == 0) {
            return 1;
        }

        int powMinus1 = power(num , pow-1);
        int ans = num * powMinus1;

        return ans;
    }

    public static void main(String[] args) {
        int num = 5;
        int pow = 3;
        System.out.println(power(num , pow ));
    }
}
