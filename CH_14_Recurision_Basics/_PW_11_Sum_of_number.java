package CH_14_Recurision_Basics;

public class _PW_11_Sum_of_number {
    public static int sumOfNumber ( int num ) {

        if (num == 1) {
            return 1;
        }

        int smallAns = sumOfNumber(num - 1) ;
        int ans = num + smallAns;
        return ans;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(sumOfNumber(num));
    }
}
