package CH_10_2D_Arrays;

import java.util.Scanner;

public class _15_Clockwise_Rotation_90_Degree {

    /*
      Approach

      first transpose and then reverse

     matrix      transpose       rotate

      123          147            741
      456    =     258      =     852
      789          369            963

      this is the method to rotate 90°
     */

      public static void printMatrix ( String name , int matrix[][], int row, int column){
            System.out.println("your " + name + " =");

            for ( int i = 0 ; i< row ; i++) {
                  for ( int j = 0 ; j < column; j++) {
                        System.out.print(matrix[i][j] +" ");
                  }
                  System.out.println();
            }
      }

      // transpose

      public static void transposeMatrix ( int matrix[][] , int n) {

            for ( int i = 0 ; i < n; i++) {
                  for ( int j = i; j <n; j++ ) {
                       int temp = matrix[i][j];
                       matrix[i][j] = matrix[j][i];
                       matrix[j][i] = temp;
                  }
            }
      }

      //reverse the transpose matrix
      public static void reverseArray ( int array[]) {
            int i = 0 , j =  array.length-1;
            while (i < j) {
                  int temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
                  i++;
                  j--;
            }
      }

      // now clock wise rotate 90°
      public static void clockwiseRotate (int matrix[][], int n){ // row and column are equal so we take n
            transposeMatrix(matrix, n  );                       // row = column = n
            for (int i = 0 ;   i < n ; i++) {
                  reverseArray(matrix[i]);
            }
            printMatrix("Your clockwise rotation of the matrix is ", matrix,n,n);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your rows number = ");
            int row = sc.nextInt();

            System.out.print("Enter your column number = ");
            int column = sc.nextInt();

            int matrix[][] = new int[row][column];

            System.out.println("Enter your matrix number = ");

            for ( int i = 0 ; i < row ; i++) {
                  for ( int j = 0 ;  j < column ; j++) {
                        matrix[i][j] = sc.nextInt();
                  }
            }

            printMatrix("matrix is  = ",matrix,row,column);
            clockwiseRotate(matrix,row);
      }
}
