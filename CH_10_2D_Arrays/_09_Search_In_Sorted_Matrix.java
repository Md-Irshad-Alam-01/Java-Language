package CH_10_2D_Arrays;

public class _9_Search_In_Sorted_Matrix {
    public static boolean stairCaseSearch ( int matrix[][] , int key) {
        int row = 0 , col = matrix[0].length-1;
        while ( row < matrix.length && col >= 0) {
            if ( matrix [row][col] == key) {
                System.out.print("found at = (" + row + " , " + col + ")");
                return true;
            }
            else if ( key < matrix[row][col] ) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int key1 = 33;
        stairCaseSearch(matrix,key1);
        System.out.println();
        int key2 = 100;
        stairCaseSearch(matrix,key2);
    }
}
