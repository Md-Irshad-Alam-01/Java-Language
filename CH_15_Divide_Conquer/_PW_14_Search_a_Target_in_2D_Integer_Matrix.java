package CH_15_Divide_Conquer;

public class _PW_14_Search_a_Target_in_2D_Integer_Matrix {
    //Key Points
    //1-> Integers in each row are in ascending order from left to right
    //2-> Integers in each column are sorted in ascending from top to bottom

    public static boolean SearchTarget ( int arr[][] , int target) {
        int n = arr.length;
        int m = arr[0].length;

        int i = 0 ;
        int j = m-1;

        while (i < n && j >= 0) {
            if ( arr[i][j] == target){
                return true;
            }

            if ( arr[i][j] > target){
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target1 = 23;
        int target2 = 28;
        System.out.println(SearchTarget(arr,target1));
        System.out.println(SearchTarget(arr,target2));
    }
}
