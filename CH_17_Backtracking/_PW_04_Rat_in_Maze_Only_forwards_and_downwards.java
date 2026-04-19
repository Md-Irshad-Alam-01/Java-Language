package CH_17_Backtracking;

public class _PW_04_Rat_in_Maze_Only_forwards_and_downwards {
    public static void printMaze ( int sr, int sc, int er, int ec, String s,int maze[][]){
        if ( sr> er || sc > ec) return;
        if ( sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        if(maze[sr][sc] == 0) return;
        //go forward
        printMaze(sr, sc+1 ,er,ec,s+"R",maze);
        //go downward
        printMaze(sr+1, sc, er ,ec, s+"D",maze);
    }

    public static void main ( String[] args) {
        int rows = 4;
        int columns = 6;
        int maze [][] = {{1,0,1,1,1,1},
                         {1,1,1,1,0,1},
                         {0,1,1,1,1,1},
                         {0,0,1,0,1,1}};

        printMaze(0,0,rows-1,columns-1,"",maze);
    }
}
