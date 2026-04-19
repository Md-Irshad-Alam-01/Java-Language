package CH_10_2D_Arrays;

import java.util.Scanner;

public class _1_Basic {
    public static void main(String[] args) {
        System.out.print("Enter your matrix=");
        int matrix[][]= new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        //input
        Scanner sc = new Scanner(System.in);
        for ( int i = 0 ; i < n;  i++) {
            for (int j = 0 ; j < m ;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for ( int i  = 0 ; i < n; i++) {
            for (int j  = 0 ; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
