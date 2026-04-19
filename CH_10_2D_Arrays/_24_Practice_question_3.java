package CH_10_2D_Arrays;

import java.util.Scanner;

public class _24_Practice_question_3 {
    public static void printArr ( String name , int matrix[][] , int row , int column ) {

        System.out.println("Your " + name + " = ");

        for ( int i = 0 ; i < row; i++) {
            for ( int j = 0 ; j < column; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transposeMatrix ( int matrix [][] , int row , int column ) {

        int transpose[][] = new int[column][row];

        for ( int i = 0 ; i < column; i++){
            for ( int j = 0; j < row ; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        printArr("transpose matrix is ", transpose,column,row);
    }

    public static void main(String[] args) {

        System.out.println("Question is =  Write a program to Find Transpose of a Matrix.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your rows number = ");
        int row = sc.nextInt();
        System.out.print("Enter your column number = ");
        int column = sc.nextInt();

        System.out.println("Enter your matrix number ");
        int matrix[][] = new int[row][column];
        for ( int i = 0 ; i < row; i++) {
            for ( int j = 0 ; j < column ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printArr("matrix is " , matrix,row,column);
        transposeMatrix(matrix,row,column);
    }
}
