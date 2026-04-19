package CH_10_2D_Arrays;

import java.util.Scanner;

public class _16_Pascals_Triangle {

    public static void printMatrix ( String name ,int matrix[][] ) {
        System.out.println("Your " + name +" =");

        for ( int i = 0 ;   i < matrix.length; i++) {
            for ( int j = 0 ; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    //pascal's triangle code

    public static int[][] pascalsTriangle( int n) {
        int ans [][] = new int[n][ ];

        for (  int i = 0 ; i < n; i++) {
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;
            for ( int j = 1 ;  j < i ; j++  ) {
                ans [i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pascals number = ");
        int num = sc.nextInt();

        int ans[][] = pascalsTriangle(num);
        printMatrix("pascals triangle is ",ans);
    }
}
