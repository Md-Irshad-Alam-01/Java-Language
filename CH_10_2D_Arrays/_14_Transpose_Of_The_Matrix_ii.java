package CH_10_2D_Arrays;

import java.util.Scanner;

public class _14_Transpose_Of_The_Matrix_ii {

    public static void printArr ( String name ,int matrix[][] , int row , int column) {
        System.out.println("Your " +name +" = ");

        for ( int i = 0 ; i < row ; i++) {
            for ( int j = 0 ; j < column; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    //transpose matrix code

    public static void transposeInPlace ( int matrix[][] , int row , int column) {
        for ( int i  = 0 ; i < column; i++) {
            for ( int j = i ; j < row ; j++ ) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        printArr("transpose matrix is ", matrix,row,column);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your matrix row number = ");
        int row = sc.nextInt();

        System.out.print("Enter your matrix column number = ");
        int column =  sc.nextInt();

        int matrix[][] = new int[row][column];

        System.out.println("Enter your matrix number = ");
        for ( int i = 0 ; i < matrix.length; i++) {
            for ( int j = 0 ;  j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printArr("matrix is ",matrix,row,column);
        transposeInPlace(matrix,row,column);
    }
}
