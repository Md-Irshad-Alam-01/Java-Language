package CH_17_Backtracking;

public class _PW_02_Print_Maze_Path_2_direction {
    public static void mazePath ( int sr , int sc , int er, int ec , String s) {
        //sr= starting row, sc = starting column
        //e r = ending row, ec = ending column

        //base case
        if( sr > er || sc > ec) {
            return ;
        }
        if (sr == ec && sc == ec) {
            System.out.println(s);
            return;
        }

        mazePath(sr+1,sc,er,ec,s+"D");
        mazePath(sr,sc+1,er,ec,s+"R");
    }

    public static void main(String[] args) {
        int row = 3 ;
        int column = 3;
        mazePath(1,1,row,column," ");
    }
}
