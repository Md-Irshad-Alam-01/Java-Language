package CH_14_Recurision_Basics;

public class _13_Optimized_Find_Power_ii {
    public static int optimizedPower(int num, int pow) {

        if ( pow == 0) {
            return 1;
        }

        int halfPower = optimizedPower(num , pow /2);
        int halfPowerSq = halfPower * halfPower;

        if ( pow % 2 != 0) {
            halfPowerSq = num * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int num = 5;
        int pow = 4;
        System.out.println(optimizedPower(num , pow));
    }

}