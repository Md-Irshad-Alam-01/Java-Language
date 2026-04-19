package CH_14_Recurision_Basics;

public class _PW_9_Find_Power_ii {
    public static int findPower ( int num , int pow) {

        if ( pow == 0 ) {
            return 1;
        }

        int smallAns = findPower(num , pow / 2);

        //if power is even
        if ( pow % 2 == 0) {
            return  smallAns * smallAns;
        }
        else {
            return num * smallAns * smallAns;
        }
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(findPower(num , 3));
        System.out.println(findPower(num , 4));
    }
}
