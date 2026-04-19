package CH_17_Backtracking;

public class _04_N_Queens_Problem {
    public static void NQueen ( char board [][] , int row) {

        // base case
        if ( row == board.length) {
            printBoard ( board) ;
            return;
        }

        //Column loop
        for ( int j = 0 ; j < board.length ; j++) {
            board[row] [j] = 'Q';
            NQueen(board , row+1);// function call
            board[row][j] = 'X'; // backtracking step
        }
    }

    public static void printBoard ( char board[] []) {
        System.out.println("_______Chess Board_______");
        for ( int i = 0  ; i < board.length ; i++) {
            for ( int j  = 0 ; j < board.length; j++ ) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 2 ;
        char board[][] = new char[n][n];
        //initialize
        for ( int i = 0 ; i < n ; i++) {
            for ( int j = 0 ; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        NQueen(board,0);
    }
}

// X for blank Spaces
// Q for Queen is placed