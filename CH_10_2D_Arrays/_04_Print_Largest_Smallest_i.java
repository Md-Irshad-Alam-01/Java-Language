package CH_10_2D_Arrays;

import java.util.Scanner;

public class _4_Print_Largest_Smallest_i {
    public static void largestAndSmallest () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row number = ");
        int n = sc.nextInt();
        System.out.print("Enter your column number = ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter your matrix number ");
        for ( int i = 0 ; i < n ; i++) {
            for ( int j = 0 ;  j < m ; j++ ) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your matrix is ");
        for ( int i = 0; i < n ; i++) {
            for ( int j = 0 ;  j < m; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Your minimum value of the matrix is = " + min);
        System.out.println("Your maximum value of the matrix is = " + max);
    }

    public static void main(String[] args) {
        largestAndSmallest();
    }
}
