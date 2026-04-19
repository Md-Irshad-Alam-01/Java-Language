package CH_10_2D_Arrays;

import java.util.Scanner;

public class _22_Practice_Question_1 {

    public static void printArr (String name, int matrix[][], int row , int column) {

        System.out.println("Your " + name + " = ");
        for ( int i = 0 ; i < row; i++) {
            for ( int j  = 0 ; j <column; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static int count7InMatrix ( int matrix[][] , int row, int column) {
        int count = 0 ;
        for ( int i= 0 ; i < row; i++) {
            for ( int j = 0 ; j < column; j++) {
                if ( matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Question is = Print the number of 7’s that are in the 2d array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows number = ");
        int row = sc.nextInt();
        System.out.print("Enter your column number = ");
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];

        System.out.println("Enter your matrix number = ");

        for ( int i = 0 ; i < row; i++) {
            for ( int j= 0 ; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printArr("matrix is ",matrix,row,column);
        System.out.println("Your 7's in the matrix is ="+count7InMatrix(matrix,row,column));
    }
}
