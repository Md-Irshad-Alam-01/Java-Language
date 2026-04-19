package CH_10_2D_Arrays;

import java.util.Scanner;

public class _23_Practice_Question_2 {
    public static void printArr ( String name , int matrix[][] , int row , int column) {
        System.out.println("Your " + name + " = ");

        for ( int i = 0 ; i  < row; i++) {
            for ( int j = 0 ; j< column; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static int secondRowSum ( int matrix[][] , int row , int column) {
        int sum = 0 ;

        //check at least two rows
        if ( row >= 2) {
            int secondRow = 1;
            for ( int j = 0; j < column; j++) {
                sum += matrix[secondRow][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Question is =  Print out the sum of the numbers inthe second row of the “num” array");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your row number = ");
        int row = sc.nextInt();
        System.out.print("Enter your column number = ");
        int column  = sc.nextInt();

        int matrix[][] = new int[row][column];
        System.out.println("Enter your matrix number =");
        for ( int i = 0 ;  i < row; i++) {
            for ( int j = 0 ; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printArr("matrix is ",matrix,row, column);
        System.out.println("Your 2nd row sum in the matrix is = " +secondRowSum(matrix,row,column));
    }
}
