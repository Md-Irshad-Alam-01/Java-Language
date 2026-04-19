package CH_15_Divide_Conquer;

public class _PW_11_Rotated_Sorted_Array_Return_The_Index_Of_Target {
    public static int searchIndexOfTheTarget ( int arr[] , int target) {
        int start = 0 ;
        int end = arr.length-1;

        while ( start <= end ) {
            int  mid = start +( end - start ) / 2;
            if ( arr[mid ] == target) {
                return mid;
            }
            else if(arr[mid ] < arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid +1;
                }
                else {
                    end = mid -1;
                }
            }
            else {
                if ( target >= arr[start] && target < arr[mid]) {
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int target1 = 4;
        int target2 = 2;
        System.out.println(searchIndexOfTheTarget(arr,target1));
        System.out.println(searchIndexOfTheTarget(arr,target2));
    }
}
