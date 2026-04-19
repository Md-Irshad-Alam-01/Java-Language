package CH_15_Divide_Conquer;

public class _PW_8_Find_Square_root_or_if_not_print_nearest_integer_ii {
    public static int findSquareRoot ( int num) {
        int start = 0 ,  end = num - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mid * mid;
            if ( val == num) {
                return mid;
            }
            else if ( val <  num) {
                start = mid + 1;
                ans = mid;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 16;
        int num2 = 17;
        int num3 = 24;
        System.out.println(findSquareRoot(num));
        System.out.println(findSquareRoot(num2));
        System.out.println(findSquareRoot(num3));
    }
}
