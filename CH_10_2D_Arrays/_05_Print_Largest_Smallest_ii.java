package CH_10_2D_Arrays;

import java.util.Scanner;

public class _5_Print_Largest_Smallest_ii {
    public static void largestAndSmallest ( int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Your matrix is ");
        for ( int i = 0 ; i < matrix.length; i++) {
            for ( int j = 0 ; j  < matrix.length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        for ( int i = 0 ; i < matrix.length; i++) {
            for ( int j = 0 ; j < matrix.length ; j++) {
                if ( min > matrix[i][j]) {
                    min = matrix[i][j];
                }
                if ( max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Your minimum value of the matrix is = " +min);
        System.out.println("Your maximum value of the matrix is = " +max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row = ");
        int n = sc.nextInt();
        System.out.print("Enter your column = ");
        int m = sc.nextInt();
        int matrix [] [] = new int[n][m];
        System.out.println("Enter your matrix number =");
        for (int i = 0; i < matrix.length; i++) {
            for ( int j =  0 ; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        largestAndSmallest(matrix);
    }
}
