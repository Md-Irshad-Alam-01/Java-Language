package CH_16_Time_And_Space_Complexity;

public class _08_Power_Function_i {
    public static int power (  int num ,int pow ) {
        if ( pow == 0 ) {
            return 1;
        }
        return num * power(num, pow -1);
    }

    public static void main(String[] args) {
        int num = 4 ;
        int pow = 3;
        System.out.println(power(num , pow));
    }
}

// time and space complexity  = O(n)