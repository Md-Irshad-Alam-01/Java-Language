package CH_15_Divide_Conquer;

public class _PW_9_Square_Root_With_P_Precision {
    public static double findSquareRootWithPrecision (double num  , int precision) {
        double start = 0 ;
        double end = num ;
        double ans = 0;

        while (start <= end  ) {
            double  mid = start + ( end - start) / 2;
            double val = mid * mid;
            if ( val == num) {
                return  mid;
            }
            else if ( val < num ) {
                start = mid + 1;
                ans = mid;
            }
            else {
                end = mid - 1;
            }
        }


        double increment = 0.1;
        for ( int i =0 ; i < precision; i++) {
            while ( ans * ans <= num) {
                ans += increment;
            }
            ans -= increment;
            increment /= 10;
        }

        return ans;
    }


    public static void main(String[] args) {
        double num = 15;
        int precision = 4;
        System.out.println(findSquareRootWithPrecision(num , precision));
    }
}
