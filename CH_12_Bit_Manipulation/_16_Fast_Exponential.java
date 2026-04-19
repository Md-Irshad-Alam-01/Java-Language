package CH_12_Bit_Manipulation;

public class _16_Fast_Exponential {
    public static int fastExponential ( int a , int n) {
        int ans = 1;
        while ( n> 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponential(3,5));
        System.out.println(fastExponential(5,3));
    }
}
