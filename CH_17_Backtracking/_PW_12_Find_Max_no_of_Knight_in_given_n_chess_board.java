package CH_17_Backtracking;

public class _PW_12_Find_Max_no_of_Knight_in_given_n_chess_board {
    static  int count = 0;
    public static void nKnight ( char [][] board , int row , int column , int num ) {
        int n =  board.length ;

        // base case
        if (row == n) {
            count = Math.max(count, num);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        int nextRow, nextCol;

        if (column == n - 1) {
            nextRow = row + 1;
            nextCol = 0;
        }
        else {
            nextRow = row;
            nextCol = column + 1;
        }

        if (isSafe(board, row, column)) {
            board[row][column] = 'K';
            nKnight(board, nextRow, nextCol, num + 1);
            board[row][column] = 'X'; // backtrack
        }
        nKnight(board, nextRow, nextCol, num);
    }

    public static boolean isSafe ( char [][] board , int row, int column ) {
        int n = board.length ;

        int i, j ;

        //2 up and 1 left
        i = row - 2;
        j = column -1;
        if ( i >= 0 && j >= 0 && board[i][j] == 'K'){
            return false;
        }

        // 2 up and 1 right
        i = row - 2;
        j = column + 1;
        if ( i >= 0 && j < n && board[i][j] == 'K') {
            return false;
        }

        //2 left and 1 up
        i = row -1 ;
        j = column -2 ;
        if ( i >= 0 && j >= 0 && board[i][j] == 'K') {
            return false;
        }

        //2 left and 1 down
        i =  row + 1;
        j = column -2;
        if( i <n && j >=0 && board[i][j] == 'K') {
            return false;
        }

        //2 right and 1 up
        i = row - 1;
        j = column +2;
        if ( i >= 0 && j < n && board[i][j] == 'K') {
            return false;
        }

        // 2 right and - 1 down
        i = row +1 ;
        j = column +2;
        if (i < n && j < n && board[i][j] == 'K') {
            return false;
        }

        //2 down and 1 left
        i = row + 2;
        j = column -1 ;
        if ( i < n && j >= 0 && board[i][j]=='K') {
            return false;
        }

        //2 down and 1 right
        i = row +2;
        j = column +1 ;
        if ( i < n  && j < n && board[i][j] == 'K') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 3 ;
        char[][] board = new char[n][n];
        for ( int i  = 0 ; i < n ; i++) {
            for ( int j = 0 ; j < n ; j++) {
                board[i][j] = 'X';
            }
        }
        nKnight(board,0,0,0);
        System.out.println(count);
    }
}