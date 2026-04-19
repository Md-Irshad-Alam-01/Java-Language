package CH_10_2D_Arrays;

import java.util.Scanner;

public class _13_Transpose_Of_The_Matrix_i {

    public static void printMatrix ( String name , int matrix[][] , int row , int column) {
        System.out.println("Your " + name +" =");
        for ( int i = 0 ; i < row; i++) {
            for ( int j = 0 ; j < column; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix ( int matrix[][], int row, int column) {
        int transpose[][] = new int[column][row];
        for ( int i = 0 ; i < column; i++) {
            for ( int j = 0 ; j < row; j++) {
                transpose[i][j]= matrix[j][i];
            }
        }
        printMatrix("transpose of the matrix is ",transpose,row,column);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your rows number = ");
        int row = sc.nextInt();

        System.out.print("Enter your column number = ");
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];

        System.out.println("Enter your matrix number = ");
        for ( int i = 0 ; i < matrix.length; i++) {
            for ( int j = 0 ; j <matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printMatrix("matrix is ",matrix,row, column);
        transposeMatrix(matrix, row,column);
    }
}
