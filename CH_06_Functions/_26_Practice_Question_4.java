package CH_6_Functions;

public class _26_Practice_Question_4 {
    public static void main(String[] args) {
        double a = 12.5;
        double b = -7.3;
        System.out.println("Math.min(" + a + ", " + b + ") = " + Math.min(a, b));
        System.out.println("Math.max(" + a + ", " + b + ") = " + Math.max(a, b));
        System.out.println("Math.abs(" + b + ") = " + Math.abs(b));

        double x = 144.0;
        System.out.println("Math.sqrt(" + x + ") = " + Math.sqrt(x));

        double base = 3.0;
        double exponent = 4.0;
        System.out.println("Math.pow(" + base + ", " + exponent + ") = " + Math.pow(base, exponent));

        // Average ("Math.avg") of three sample numbers:
        double n1 = 10.0, n2 = 20.0, n3 = 30.0;
        double average = (n1 + n2 + n3) / 3.0;
        System.out.println("Average of " + n1 + ", " + n2 + ", " + n3 + " = " + average);
    }
}