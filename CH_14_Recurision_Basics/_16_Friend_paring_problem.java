package CH_14_Recurision_Basics;

public class _16_Friend_paring_problem {
    public static int friendParingProb ( int num) {

        //Base case
        if (num == 1 || num == 2) {
            return num;
        }

        //Work
        //Single person
        int fNumMinus1 = friendParingProb(num - 1);

        //paired person
        int fNumMinus2 = friendParingProb(num - 2);

        //Total ways
        int totalPaired = fNumMinus1 + fNumMinus2;

        return totalPaired;

    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        System.out.println(friendParingProb(num1));
        System.out.println(friendParingProb(num2));
        System.out.println(friendParingProb(2));
        System.out.println(friendParingProb(1));
    }
}
