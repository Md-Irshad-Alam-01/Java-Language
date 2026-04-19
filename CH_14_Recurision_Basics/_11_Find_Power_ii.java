package CH_14_Recurision_Basics;

public class _11_Find_Power_ii {
    public static int power ( int num  , int pow) {

        if ( pow == 0) {
            return 1;
        }

        return num * power(num , pow - 1);
    }

    public static void main(String[] args) {
        int num = 6 ;
        int pow = 4;
        System.out.println(power(num , pow));
    }
}
