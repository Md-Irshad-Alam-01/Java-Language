package CH_10_2D_Arrays;

import java.util.Scanner;

public class _21_Under_Dimension_matrix_Return_Sum_iii {

    public static void printMatrix(String name, int matrix[][]) {

        System.out.println("Your " + name + " = ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Build 2D prefix sum matrix

    public static void findPrefixSumMatrix ( int matrix[][] ) {
        int row = matrix.length;
        int column = matrix[0].length;

        //traverse horizontally to calculate row wise prefix sum
        for ( int i = 0 ;  i < row; i++) {
            for ( int j = 1; j < column; j++ ) {
                matrix[i][j] += matrix[i][j-1];
            }
        }

        //traverse vertically to calculate column wise prefix sum
        for ( int j = 0; j < column; j++) {
            for ( int  i = 1; i < row; i++) {
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    //Query sum using 2D prefix sums

    public static int findSum(int matrix[][], int l1, int r1, int l2, int r2) {

        int sum = matrix[l2][r2];
        int up = 0 , left = 0 , leftUp = 0 ;

        if (l1 > 0) {
            up = matrix[l1 - 1][r2];
        }
        if (r1 > 0) {
            left = matrix[l2][r1 - 1];
        }
        if (l1 > 0 && r1 > 0) {
            leftUp = matrix[l1 - 1][r1 - 1];
        }

        return sum - up - left + leftUp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Question is given a matrix 'a' of dimension n * m and 2 coordinates (l1,r1) and(l2,r2) and" +
                "return the sum of the rectangle form ...");

        System.out.println("We use prefix sum over column and rows both: ");

        System.out.print("Enter your rows number = ");
        int row = sc.nextInt();
        System.out.print("Enter your column number = ");
        int column = sc.nextInt();

        int matrix[][] = new int[row][column];
        int totalElement = row * column;
        System.out.println("Enter " + totalElement + " values = ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printMatrix(" matrix is = ", matrix);

        // Precompute prefix sums
        findPrefixSumMatrix(matrix);


        System.out.println("Enter rectangle boundary =");
        System.out.print("Enter l1 = ");
        int l1 = sc.nextInt();
        System.out.print("Enter r1 = ");
        int r1 = sc.nextInt();
        System.out.print("Enter l2 = ");
        int l2 = sc.nextInt();
        System.out.print("Enter r2 = ");
        int r2 = sc.nextInt();

        System.out.println("rectangle sum = "+findSum(matrix,l1,r1,l2,r2));
    }
}
