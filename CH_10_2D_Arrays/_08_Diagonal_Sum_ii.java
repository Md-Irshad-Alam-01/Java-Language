package CH_10_2D_Arrays;

public class _8_Diagonal_Sum_ii {
    public static int diagonalSum ( int matrix[][]) {
        int sum = 0 ;
        for ( int i = 0 ; i < matrix.length; i++) {
            //primary diagonal
            sum += matrix[i][i];
            //secondary diagonal
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrixEven[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.print("Your even matrix diagonal sum is =");
        System.out.println(diagonalSum(matrixEven));
        int matrixOdd[] [] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.print("Your odd matrix diagonal sum is =");
        System.out.println(diagonalSum(matrixOdd));
    }
}
