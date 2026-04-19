package CH_6_Functions;

public class _11_binomial_Coefficient {
    public static int factorial ( int n) {
        int fact = 1;
        for ( int i = 1; i <= n; i++) {
            fact = fact* i;
        }
        return fact;
    }

    public static int BinomialCoefficient ( int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int factN_minus_R = factorial(n - r);
        int binCoe = fact_n / (fact_r * factN_minus_R);
        return binCoe;
    }

    public static void main(String[] args) {
        System.out.println("Find Binomial Coefficient of the given number.");
        System.out.println("Your Binomial Coefficient of th number is = "+(BinomialCoefficient(5,2)));
    }
}

