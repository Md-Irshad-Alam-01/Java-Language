package CH_16_Time_And_Space_Complexity;

public class _10_Optimal_Power_Function {
    public static int power ( int num , int pow) {
        if ( pow == 0) {
            return 1;
        }

        int halfPower = power ( num , pow / 2);
        int halfPowerSq = halfPower * halfPower;

        if ( pow % 2 != 0) {
            return num * halfPowerSq;
        }
        else {
            return halfPowerSq;
        }
    }

    public static void main(String[] args) {
        int num = 2 ;
        int pow = 3;
        System.out.println(power(num , pow));
    }
}
