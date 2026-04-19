package CH_10_2D_Arrays;

import java.util.Scanner;

public class _2_Print_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row = ");
        int n = sc.nextInt();
        System.out.print("Enter your column = ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter your matrix = ");
        for ( int i = 0 ; i < n ; i++) {
            for ( int j = 0 ; j < m ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your output of the matrix is =");
        for ( int i = 0 ; i < n; i++) {
            for ( int j = 0 ; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
