package CH_10_2D_Arrays;

import java.util.Scanner;

public class _20_Under_Dimension_matrix_Return_Sum_ii {

    public static void printMatrix(String name, int matrix[][]) {

        System.out.println("Your " + name + " = ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void preprocess(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] += matrix[i][j - 1];  // row-wise prefix sum
            }
        }
    }

    public static int findSum(int matrix[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Question is given a matrix 'a' of dimension n * m and 2 coordinates (l1,r1) and(l2,r2) and" +
                "return the sum of the rectangle form ...");

        System.out.println("We use pre calculating the horizontal sum for each row in the matrix: ");

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


        System.out.println("Enter rectangle boundary =");
        System.out.print("Enter l1 = ");
        int l1 = sc.nextInt();
        System.out.print("Enter r1 = ");
        int r1 = sc.nextInt();
        System.out.print("Enter l2 = ");
        int l2 = sc.nextInt();
        System.out.print("Enter r2 = ");
        int r2 = sc.nextInt();

        preprocess(matrix);
        System.out.println("rectangle sum = "+findSum(matrix,l1,r1,l2,r2));
    }
}