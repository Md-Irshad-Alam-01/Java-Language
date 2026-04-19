package CH_10_2D_Arrays;

import java.util.Scanner;

public class _3_Search_Function {
    public static boolean search( int matrix[][] , int key) {
        for ( int i = 0 ; i < matrix.length; i++) {
            for( int j = 0 ; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("found at ( " + i + " , " + j + " )") ;
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row number = ");
        int n = sc.nextInt();
        System.out.print("Enter your column number = ");
        int m = sc.nextInt();
        int matrix [] [] = new int[n][m];
        System.out.println("Enter your matrix number = ");
        for ( int i = 0 ; i < n; i++) {
            for ( int j = 0 ; j < m ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your output of the matrix = ");
        for ( int i = 0 ; i < n; i++ ){
            for ( int j = 0 ; j < m ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter your key = ");
        int key = sc.nextInt();
        search(matrix,key);
    }
}
