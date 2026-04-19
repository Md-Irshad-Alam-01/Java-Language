package CH_7_Pattern_Part_ii;

public class _11_Palindrome_Pattern {
    public static void Palindrome( int num ) {
        for ( int i = 1 ; i <= num ; i++) {
            for(int j =1 ; j <= num -i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }
            for ( int j = 2; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Palindrome(5);
    }
}
