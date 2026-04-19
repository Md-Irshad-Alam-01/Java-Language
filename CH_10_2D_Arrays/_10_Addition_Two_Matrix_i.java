package CH_10_2D_Arrays;

import java.util.Scanner;

public class _10_Addition_Two_Matrix_i {
    public static void sumTwoMatrix ( int matrixA[][] , int r1, int r2,int matrixB[][], int c1, int c2) {
        if ( r1 != r2 || c1!=c2) {
            System.out.println("Wrong input...");
            return;
        }
        int sum[][] = new int[r1][c1];
        for ( int i = 0 ; i < r1; i++) {
            for ( int j = 0; j< c1; j++){
                sum[i][j]= matrixA[i][j] + matrixB[i][j];
            }
        }
        for ( int i = 0; i < r1; i++) {
            for ( int j = 0 ;  j < c1 ; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
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
        System.out.println("Your matrix A =");
        for ( int i = 0 ; i< r1; i++) {
            for ( int j = 0 ;  j< c1; j++){
                System.out.print(matrixA[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Your matrix B =");
        for ( int i = 0 ; i < r2 ; i++) {
            for ( int j = 0 ; j < c2; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Your sum of two matrix =");
        sumTwoMatrix(matrixA,r1,r2,matrixB,c1,c2);
    }
}
