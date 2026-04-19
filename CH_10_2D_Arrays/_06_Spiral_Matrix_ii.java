package CH_10_2D_Arrays;

import java.util.Scanner;

public class _6_Spiral_Matrix_ii {
    public static void spiralMatrix ( int matrix[] []) {
        int startRow = 0 ;
        int startColumn = 0;
        int endColumn = matrix.length-1;
        int endRow = matrix[0].length-1;

        while ( startRow <= endRow && startColumn <= endColumn ) {
            //top
            for ( int j = startColumn ; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for ( int  i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn]+" ");
            }
            //bottom
            for ( int j = endColumn-1; j >= startColumn; j--) {
                if( startRow==endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for ( int i = endRow-1; i >startRow ; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows number = ");
        int n = sc.nextInt();
        System.out.println("Enter your column number = ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter your matrix number =");
        for ( int i = 0 ; i < matrix.length;i++) {
            for ( int j = 0 ; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your matrix is =");
        for ( int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Your spiral matrix is = ");
        spiralMatrix(matrix);
    }
}
