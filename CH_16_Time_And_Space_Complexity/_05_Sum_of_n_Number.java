package CH_16_Time_And_Space_Complexity;

public class _05_Sum_of_n_Number {
    public static int sumNum( int num) {
        if ( num == 0) {
            return 0;
        }
        return num + sumNum(num - 1);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        System.out.println(sumNum(num1));
        System.out.println(sumNum(num2));
    }
}

// time complexity = O(n)
// space complexity = O(n)
