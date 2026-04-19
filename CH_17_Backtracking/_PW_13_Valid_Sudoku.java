package CH_17_Backtracking;

public class _PW_13_Valid_Sudoku {
    public static boolean isValid (char[][] board , int row , int column , char num) {

        //check row
        for ( int j = 0 ; j < 9 ; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        //check column
        for ( int i = 0 ; i < 9 ;i++) {
            if ( board[i][column] == num ) {
                return false;
            }
        }

        //check 3 * 3 grid
        int startRow =( row / 3) * 3;
        int startColumn = (column / 3) * 3;
        for ( int i = startRow; i < startRow + 3; i++ ) {
            for ( int j = startColumn; j < startColumn + 3; j++) {
                if(board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidSudoku(char[][] board) {
        for ( int i = 0; i < 9 ; i++) {
            for ( int j = 0 ; j < 9; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                char num = board[i][j];
                board[i][j] = '.';
                if(isValid(board,i,j,num) == false) {
                    return false;
                }
                board[i][j]= num;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char sudoku[][] = { {'5','3','.','.','7','.','.','.','.'},
                           {'6','.','.','1','9','5','.','.','.'},
                           {'.','9','8','.','.','.','.','6','.'},
                           {'8','.','.','.','6','.','.','.','3'},
                           {'4','.','.','8','.','3','.','.','1'},
                           {'7','.','.','.','2','.','.','.','6'},
                           {'.','6','.','.','.','.','2','8','.'},
                           {'.','.','.','4','1','9','.','.','5'},
                           {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(sudoku));
    }
}
