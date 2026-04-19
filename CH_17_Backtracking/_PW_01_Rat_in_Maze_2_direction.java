package CH_17_Backtracking;

public class _PW_01_Rat_in_Maze_2_direction {
    public static int maze (int sr, int sc, int er, int ec) {
        //sr= starting row, sc = starting column
        //e r = ending row, ec = ending column

        if ( sr > er || sc > ec) {
            return 0 ;
        }
        if ( sr == er  || sc == ec) {
            return 1;
        }

        int downWays = maze(sr+1 , sc,er,ec);
        int rightWays = maze(sr,sc+1,er,ec);
        int totalWays = downWays+rightWays;
        return totalWays;
    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int count = maze(1,1,rows,columns);
        System.out.println(count);
    }
}
