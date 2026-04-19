package CH_17_Backtracking;

public class _PW_14_Sudoku_Solver {
    public static boolean isValid ( char[][] board, int row , int column , char num) {
        //check row
        for ( int i = 0 ; i < 9 ; i++) {
            if(board[row][i] == num) {
                return false;
            }
        }

        //check column
        for ( int i  = 0;  i < 9 ; i++) {
            if ( board[i][column] == num) {
                return false;
            }
        }

        //check 3*3 grid
        int startRow = (row / 3) * 3;
        int startColumn = (column / 3) * 3;
        for ( int i = startRow; i < startRow +3; i++) {
            for ( int j = startColumn; j < startColumn +3 ; j++) {
                if(board[i][j] == num ) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void solve (char[][] board , int row , int column , char[][] grid) {

        if ( row == 9) {
            for ( int i = 0 ; i < 9; i++) {
                for ( int j = 0 ;  j < 9 ; j++){
                    grid[i][j] = board[i][j];
                }
            }
            return;
        }
        else if (board[row][column] != '.') {
            if ( column != 8) {
                solve(board,row,column+1,grid);
            }
            else {
                solve(board,row+1,0,grid);
            }
        }

        else {
            for ( char ch = '1'; ch <= '9'; ch++) {
                if(isValid(board, row, column, ch)) {
                    board[row][column] = ch;
                    if(column != 8) {
                        solve(board, row, column+1, grid);
                    }
                    else {
                        solve(board, row+1, 0, grid);
                    }
                    board[row][column] = '.';
                }
                board[row][column] = '.';
            }
        }
    }
    public static void solveSudoku(char[][] board) {
        char[][] grid = new char[9][9];
        solve(board,0,0,grid);
        for ( int i = 0; i< 9; i++) {
            for ( int j = 0 ; j < 9 ; j++) {
                board[i][j] = grid[i][j];
            }
        }
    }

    public static void main(String[] args) {
        char[][ ] board = {{'5','3','.','.','7','.','.','.','.'},
                           {'6','.','.','1','9','5','.','.','.'},
                           {'.','9','8','.','.','.','.','6','.'},
                           {'8','.','.','.','6','.','.','.','3'},
                           {'4','.','.','8','.','3','.','.','1'},
                           {'7','.','.','.','2','.','.','.','6'},
                           {'.','6','.','.','.','.','2','8','.'},
                           {'.','.','.','4','1','9','.','.','5'},
                           {'.','.','.','.','8','.','.','7','9'}};
        solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
