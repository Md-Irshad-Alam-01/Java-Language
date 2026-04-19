package CH_17_Backtracking;

public class _06_N_Queen_Count_ways_Problem {

    static int count = 0;

    public static boolean isSafe ( char board[][], int row , int col) {

        //Vertical up
        for ( int i = row -1; i>= 0; i--) {
            if ( board[i][col] == 'Q') {
                return false ;
            }
        }

        // diagonal left up
        for ( int i = row-1, j = col - 1 ; i >= 0 && j >= 0; i-- ,j--) {
            if ( board [i][j] == 'Q'){
                return false ;
            }
        }
        //Diagonal right up
        for ( int i = row -1 , j = col + 1; i >=0 && j < board.length; i-- , j++) {
            if ( board [i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void N_Queen ( char board [][], int row) {

        // base case
        if ( row == board.length) {
            count++;
            return;
        }

        //column up
        for ( int j = 0 ; j < board.length ; j++) {
            if ( isSafe(board, row ,j)) {
                board[row][j] = 'Q';
                N_Queen (board , row +1);
                board [row ][j] = 'X';
            }
        }
    }


    public static void main(String[] args) {
        int n = 4 ;
        char board[][] = new char[n][n];
        //initialize
        for ( int i = 0 ; i < n ; i++) {
            for ( int j = 0 ; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        N_Queen(board,0);
        System.out.println("Total ways = " +count);
    }
}
