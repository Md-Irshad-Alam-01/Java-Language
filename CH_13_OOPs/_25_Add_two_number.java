package CH_13_OOPs;

import  java.util.*;

class Algebra {
    int add ( int a , int b ) {
        int ans = a + b;
        return ans;
    }
}

public class _25_Add_two_number {
    public static void main(String[] args) {
        Algebra algebra = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b = sc.nextInt();
        System.out.println("Sum of two number is  = ");
        int ans = algebra.add(a,b);
        System.out.println(ans);
    }
}
