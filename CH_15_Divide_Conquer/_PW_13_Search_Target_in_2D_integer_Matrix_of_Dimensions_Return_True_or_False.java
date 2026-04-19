package CH_15_Divide_Conquer;

public class _PW_13_Search_Target_in_2D_integer_Matrix_of_Dimensions_Return_True_or_False {
    public static boolean SearchMatrix ( int arr[][] , int target ) {
        //number of rows = n , number of column = m
        int n = arr.length, m = arr[0].length;
        int start = 0 ;
        int end = n * m - 1;

        while ( start <=  end ) {
            int mid = start + ( end - start ) / 2;
            int midElement = arr[mid / m] [mid % m];

            if ( midElement == target) {
                return true;
            }
            if (target < midElement) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false ;
    }

    public static void main(String[] args) {
        int arr[][] = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}};
        int target = 3;
        int target2 = 13;
        System.out.println(SearchMatrix(arr,target));
        System.out.println(SearchMatrix(arr,target2));
    }
}
