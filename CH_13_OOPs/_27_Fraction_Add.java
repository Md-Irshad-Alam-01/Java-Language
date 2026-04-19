package CH_13_OOPs;

import java.util.Scanner;

class Fraction {
    int num;
    int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        simplify();
    }

    public void simplify() {
        int hcf = gcd(num, den);
        num /= hcf;
        den /= hcf;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static Fraction add(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.den + f1.den * f2.num;
        int denominator = f1.den * f2.den;
        return new Fraction(numerator, denominator);
    }
}

public class _27_Fraction_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first numerator number = ");
        int num1st = sc.nextInt();
        System.out.print("Enter your first denominator number = ");
        int den1st = sc.nextInt();

        System.out.print("Your first fraction number =");
        Fraction f1 = new Fraction(num1st,den1st);
        System.out.println(f1.num + "/" +f1.den);


        System.out.print("Enter your second numerator number = ");
        int num2nd = sc.nextInt();
        System.out.print("Enter your second denominator number = ");
        int den2nd = sc.nextInt();

        System.out.print("Your second fraction number = ");
        Fraction f2 = new Fraction(num2nd,den2nd);
        System.out.println(f2.num + "/" +f2.den);

        System.out.println("Your fraction sum of the numerator and denominator  number is = ");
        Fraction f3 = Fraction.add(f1,f2);
        System.out.println(f3.num + "/" +f3.den);
    }
}
