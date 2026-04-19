package CH_14_Recurision_Basics;

public class _12_Optimized_Find_Power_i {
    public static int optimizedFindPower ( int num , int pow) {

        if ( pow == 0 ) {
            return 1;
        }

        int halfPowerSquare = optimizedFindPower(num , pow /2) * optimizedFindPower(num , pow/2);

        // pow is odd
        if ( pow % 2 != 0) {
            halfPowerSquare = num * halfPowerSquare;
        }

        return halfPowerSquare;
    }

    public static void main(String[] args) {
        int num = 5 ;
        int pow = 4;
        System.out.println(optimizedFindPower(num , pow ));
    }
}
