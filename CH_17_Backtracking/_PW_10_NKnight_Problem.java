package CH_17_Backtracking;

public class _PW_10_NKnight_Problem {

    public static boolean isSafe ( int [][] board , int row , int column, int num) {
        int n  =  board.length;
        // base case
        if (board[row][column] == n*n -1) {
            return true;
        }

        int i , j;

        //2 up and 1 right
        i = row -2 ;
        j = column +1;
        if (i >= 0 && j < n && board[i][j] == num +1 ) {
            return isSafe(board, i , j , num +1);
        }

        //2 up and 1 left
        i = row -2 ;
        j = column - 1;
        if ( i >=0  && j >=0 && board[i][j] == num+1) {
            return isSafe(board, i , j , num +1);
        }

        // 2 left and 1 up
        i = row - 1 ;
        j = column -2;
        if (i >=0  && j >=0 && board[i][j] == num+1) {
            return isSafe(board, i , j , num +1);
        }

        // 2 left and 1 down
        i = row +1;
        j = column - 2 ;
        if ( i < n && j >= 0 && board[i][j] == num + 1) {
            return isSafe(board, i , j , num +1);
        }

        // 2 right and 1 up
        i = row - 1;
        j = column +2 ;
        if (i >=0 && j < n && board [i][j] == num +1){
            return isSafe(board,i,j, num+1);
        }

        // 2 right and 1 down
        i = row +1 ;
        j = column + 2;
        if ( i < n && j < n && board[i][j] == num +1) {
            return isSafe(board,i,j, num+1);
        }

        // 2 down and 1 left
        i = row +2 ;
        j = column -1;
        if ( i < n && j >=0 && board [i][j] == num +1) {
            return isSafe(board,i,j, num+1);
        }

        //2 down and 1 right
        i = row +2 ;
        j = column +1;
        if ( i < n && j < n && board [i][j] == num +1) {
            return isSafe(board,i,j, num+1);
        }

        return false;
    }

    public static boolean checkValidBoard (int [][] board ) {
        if ( board[0][0] != 0) return false;
        return isSafe(board,0,0,0);
    }


    public static void main(String[] args) {
        int board[][] = {{0 , 11, 16, 5 , 20},
                         {17, 4 , 19, 10, 15},
                         {12, 1 , 8 , 21, 6 },
                         {3 , 18, 23, 14, 9 },
                         {24, 13, 2 , 7 , 22}};
        System.out.println(checkValidBoard(board));
    }
}
