package CH_14_Recurision_Basics;

public class _14_Tiling_Problem {
    public static int tilingProblem ( int n) {

        //Base case
        if ( n == 0 || n == 1) {
            return 1;
        }

        //Work
        //Vertical Choice
        int fnm1 = tilingProblem(n -1);

        //Horizontal Choice
        int fnm2 = tilingProblem(n - 2);

        //call inner function
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {

        System.out.println(tilingProblem(5));
        System.out.println(tilingProblem(4));
        System.out.println(tilingProblem(8));
    }
}
