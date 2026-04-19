package CH_17_Backtracking;

public class _PW_03_Rat_in_Maze_4_Direction {
    static boolean[][] isVisited;
    public static void ratMaze( int sr , int sc, int er, int ec, String s) {
        // boundary check
        if ( sr < 0 || sc < 0) return;
        if (sr>er || sc>ec) return;
        // already visited
        if(isVisited[sr][sc] ) return;
        // destination reached
        if(sr == er && sc ==ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        //go right
        ratMaze(sr,sc+1,er,ec,s+"R");
        //go left
        ratMaze(sr,sc-1,er,ec,s+"L");
        //go up
        ratMaze(sr-1,sc,er,ec,s+"U");
        //go down
        ratMaze(sr+1,sc,er,ec,s+"D");
        //backtracking
        isVisited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        // static boolean[][] isVisited;
        isVisited= new boolean[rows][columns];
        ratMaze(0,0,rows -1,columns-1," ");
    }
}
