package CH_16_Time_And_Space_Complexity;

public class _09_Power_Function_ii {
    public static int power ( int num , int pow) {
        if ( pow == 0) {
            return 1;
        }

        int halfPowerSq = power(num , pow/2) * power(num , pow /2);
        if ( pow % 2 != 0) {
            return num * halfPowerSq;
        }
        else{
            return halfPowerSq;
        }
    }

    public static void main(String[] args) {
        int num = 4 ;
        int pow = 3;
        System.out.println(power(num , pow));
    }
}
