package CH_17_Backtracking;

public class _PW_11_Place_NKnight__such_that_they_do_not_attack_each_other {

    static int count = 0;

    public static void solveNKnight( boolean[][] board , int row , int column , int knight) {
        int n = board.length;

        //base case
        if (knight == 0 ) {
            print(board);
            count++;
            return;
        }
        if ( row == n ) {
            return;
        }

        int nextRow = ( column == n -1 ) ? row + 1: row;
        int nextCol = ( column == n -1) ? 0 : column + 1;

        if(isSafe(board, row, column)) {
            board[row][column] = true;
            solveNKnight(board, nextRow, nextCol, knight -1);
            board[row][column] = false;
        }
        solveNKnight(board, nextRow,nextCol, knight);
    }

    public static boolean isSafe ( boolean[][]  board , int row , int column ) {
        int n = board.length ;

        int i , j;

        //2 up and 1 right
        i = row - 2;
        j = column +1;
        if ( i >=0 && j < n && board[i][j]) {
             return false;
        }

        // 2 up and 1 left
        i = row -2 ;
        j = column -1;
        if ( i >= 0 && j >= 0 && board[i][j] ) {
            return false;
        }

        //2 left and 1 up
        i = row - 1;
        j = column -2;
        if ( i >=0 && j >=0 && board[i][j]) {
            return false;
        }

        //2 left and 1 down
        i = row +1 ;
        j = column -2;
        if (i < n && j >= 0 && board[i][j] ) {
            return false;
        }

        //2 right and 1 up
        i = row -1 ;
        j = column +2;
        if ( i >=0 && j < n && board[i][j]) {
            return false;
        }

        //2 right and 1 down
        i = row +1 ;
        j = column+2;
        if( i < n && j <n && board[i][j]) {
            return false;
        }

        // 2 down and 1 left
        i = row +2;
        j = column -1;
        if ( i < n && j >= 0 && board[i][j]  ) {
            return false;
        }

        //2 down and 1 right
        i = row+2 ;
        j = column+1;
        if( i < n && j < n && board[i][j]){
            return false;
        }

        return true;
    }


    public static void print ( boolean [][] board  ) {
        for ( int i = 0 ; i < board.length ; i++) {
            for ( int j = 0; j < board.length ; j++) {
                System.out.print(board[i][j] ? "K" : "X");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4 ;
        int knight = 4 ;
        boolean[][] board = new boolean[n][n];
        System.out.println( knight + " knights on " + n + "x" + n + " board" );
        solveNKnight(board,0 , 0, knight);
        System.out.println("Total possible output ="+count);
    }
}
