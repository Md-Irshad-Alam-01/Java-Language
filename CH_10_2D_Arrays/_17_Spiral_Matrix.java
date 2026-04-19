package CH_10_2D_Arrays;

import java.util.Scanner;

public class _17_Spiral_Matrix {

    public static void printMatrix ( String name , int matrix[][]) {
        System.out.println("Your " + name + " =");

        for ( int i = 0 ; i < matrix.length; i++) {
            for ( int j = 0 ;  j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void printSpiralOrder ( int matrix [][] , int row , int column) {
        int topRow = 0 , bottomRow = row-1 , leftColumn = 0 , rightColumn =  column-1;

        int totalElement = 0 ;

        System.out.println("Spiral order is = ");
        while (totalElement < row*column){

            //left to right

            for ( int j = leftColumn; j <= rightColumn && totalElement < row*column; j++) {
                System.out.print(matrix[topRow][j]+" ");
                totalElement++;
            }
            topRow++;

            //top to bottom

            for  ( int i = topRow; i <= bottomRow && totalElement < row*column; i++) {
                System.out.print(matrix[i][rightColumn]+" ");
                totalElement++;
            }
            rightColumn--;

            //right to left

            for ( int j  = rightColumn; j >= leftColumn && totalElement < row*column; j--) {
                System.out.print(matrix[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;

            //bottom to top

            for (int i = bottomRow; i >= topRow && totalElement < row*column; i--) {
                System.out.print(matrix[i][leftColumn]+" ");
                totalElement++;
            }
            leftColumn++;
        }

        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your rows number = ");
        int row = sc.nextInt();

        System.out.print("Enter your column number = ");
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];

        System.out.println("Enter your matrix number = ");

        for ( int i = 0 ; i < row ; i++) {
            for ( int j = 0 ;  j < column ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printMatrix("matrix is ",matrix);
        printSpiralOrder(matrix,row,column);
    }
}
