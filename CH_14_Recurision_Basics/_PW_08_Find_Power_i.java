package CH_14_Recurision_Basics;

public class _PW_8_Find_Power_i {
    public static int findPower ( int num , int pow) {

        if ( pow == 0 ) {
            return 1;
        }

        int smallAns = findPower(num , pow - 1);
        int finalAns = num * smallAns;

        return finalAns;
    }

    public static void main(String[] args) {
        int num = 5 ;
        int pow = 4 ;
        System.out.println(findPower(num , pow));
    }
}
