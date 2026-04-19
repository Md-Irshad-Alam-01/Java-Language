package CH_15_Divide_Conquer;

public class _PW_2_Use_Boolean_Find_target_in_Sorted_Array {
    public static boolean findTargetInSortedArray ( int arr[] , int target) {
        int start = 0;
        int end = arr.length-1;

        while ( start <= end ) {

            int mid = start + (end - start ) / 2;

            if ( arr[ mid] == target) {
                return true;
            }

            else if ( target < arr[mid]) {
                end = mid -1 ;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7};
        int target1 = 4;
        int target2 = 8;
        System.out.println(findTargetInSortedArray(arr, target1));
        System.out.println(findTargetInSortedArray(arr, target2));
    }
}
