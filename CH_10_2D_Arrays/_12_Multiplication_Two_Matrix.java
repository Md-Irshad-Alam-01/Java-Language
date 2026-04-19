package CH_10_2D_Arrays;

import java.util.Scanner;

public class _12_Multiplication_Two_Matrix {
    public static void printMatrix ( String name , int matrix[][] , int row , int column) {
        System.out.println("Your " + name + "=");
        for ( int i = 0 ; i < row ; i++) {
            for ( int j = 0 ;  j < column; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    // multiplication of two matrix
    public static void multiplicationMatrix ( int matrixA[][] , int r1, int c1 , int matrixB[][] , int r2 , int c2) {
        if ( c1 != r2) {
            System.out.println("Wrong input...");
            return;
        }
        int multiply[][] = new int[r1][c2];
        for ( int i = 0 ; i < r1 ; i++) {
            for ( int j = 0 ; j < c2; j++) {
                for ( int k = 0 ; k < c1; k++) {
                    multiply[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        printMatrix("multiplication matrix is " ,multiply,r1,c2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your matrix A rows number = ");
        int r1 = sc.nextInt();

        System.out.print("Enter your matrix A columns number = ");
        int c1 = sc.nextInt();

        int matrixA[][] = new int[r1][c1];

        System.out.println("Enter your matrix A number =");
        for ( int i = 0 ; i < matrixA.length; i++) {
            for (int j = 0 ; j < matrixA[i].length; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 2nd matrix:");

        System.out.print("Enter your matrix B rows number = ");
        int r2 = sc.nextInt();

        System.out.print("Enter your Matrix B column number =  ");
        int c2 = sc.nextInt();

        int matrixB[][] = new int[r2][c2];

        System.out.println("Enter your matrix B number =");
        for( int i = 0; i < matrixB.length; i++) {
            for ( int j = 0; j <  matrixB[i].length; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        printMatrix("matrix A is ",matrixA,r1,c1);
        printMatrix("matrix B ", matrixB,r2,c2);
        multiplicationMatrix(matrixA,r1,c1,matrixB,r2,c2);
    }
}
