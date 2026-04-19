package CH_17_Backtracking;

public class _PW_09_N_Queen {

    static int count = 0;

    public static void nQueen (  char board[][] ,int row ) {
        int n = board.length;
        if(row == n) {
            count++;
            for ( int i = 0 ; i < n;i++) {
                for ( int j = 0; j< n ; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for ( int j = 0 ; j < n ; j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nQueen(board,row+1);
                board[row][j]='X';
            }
        }
    }
    public static boolean isSafe(char board[][] , int row , int column ) {
        int n =  board.length;
        //check column
        for ( int i = 0 ; i < n; i++) {
            if ( board[i][column]=='Q'){
                return false ;
            }
        }

        //check row
        for ( int j = 0; j < n ; j++ ) {
            if ( board[row][j] == 'Q'){
                return false;
            }
        }

        //check 1st Quadrant
        for ( int i = row-1 ,j = column+1; i >=0 && j < n; i--,j++ ){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        //check 2nd Quadrant
        for (int i = row -1 , j = column - 1; i>=0 && j >=0; i-- , j --) {
            if ( board[i][j] == 'Q'){
                return false;
            }
        }
        //Check 3rd Quadrant
        for ( int i = row +1 ,j = column -1 ; i< board.length && j >= 0; i++ , j--) {
            if ( board [i][j] == 'Q'){
                return false;
            }
        }
        //Check 4th Quadrant
        for ( int i = row + 1, j = column+1 ;  i < board.length && j < board.length ; i++ , j++) {
            if ( board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n  =8;
        char[][]board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j  = 0 ; j < n ; j++) {
                board[i][j] = 'X';
            }
        }
        nQueen(board,0);
        System.out.println("Total possible output=" +count);
    }
}
