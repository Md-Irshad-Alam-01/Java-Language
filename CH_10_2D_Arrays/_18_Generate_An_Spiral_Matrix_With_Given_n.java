package CH_10_2D_Arrays;

import java.util.Scanner;

public class _18_Generate_An_Spiral_Matrix_With_Given_n {

    public static void printMatrix ( String name , int matrix[][]  ) {
        System.out.println("Your " + name + " = ");

        for ( int i = 0 ; i < matrix.length ; i++) {
            for ( int j = 0 ;  j < matrix[i].length  ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateSpiralMatrix ( int num) {
        int matrix[][] = new int[num][num];

        int topRow = 0 , bottomRow = num-1 , leftColumn = 0, rightColumn = num-1 , curr = 1;

        while (curr   <= num * num) {

            //left to right

            for ( int j = leftColumn; j  <= rightColumn && curr <= num*num ; j++) {
                matrix[topRow][j] = curr++;
            }
            topRow++;

            //top to bottom

            for (int i = topRow ; i <= bottomRow && curr <= num*num ;  i++){
                matrix[i][rightColumn] = curr++;
            }
            rightColumn--;

            //right to left

            for (int j = rightColumn ; j >= leftColumn && curr <= num*num; j--) {
                matrix[bottomRow][j] = curr++;
            }
            bottomRow--;

            //bottom to left

            for (int i = bottomRow ; i >= topRow && curr <= num*num; i--) {
                matrix[i][leftColumn] = curr++;
            }
            leftColumn++;

        }
        return matrix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n size for generate spiral matrix = ");
        int num = sc.nextInt();

        int matrix[][] = generateSpiralMatrix(num);
        printMatrix("generated num * num matris " + num + " * " + num + " spiral matrix " , matrix);
    }
}
