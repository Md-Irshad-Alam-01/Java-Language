package CH_15_Divide_Conquer;

public class _PW_7_Find_Square_root_or_if_not_print_nearest_integer_i {

    //Linear Search

    public static int findSquareRoot ( int num ) {
        int y  = 0 ;
        while (y * y <= num) {
            y++;
        }
        return y-1;
    }

    public static void main(String[] args) {
        int num = 15;
        System.out.println(findSquareRoot(num));
    }
}
