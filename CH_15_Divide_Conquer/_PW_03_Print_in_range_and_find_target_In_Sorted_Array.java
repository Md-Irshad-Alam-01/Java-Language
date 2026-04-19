package CH_15_Divide_Conquer;

public class _PW_3_Print_in_range_and_find_target_In_Sorted_Array {
    public static boolean printInRangeAndFindTargetInSortedArray ( int arr[] , int target) {

        int start = 0 ;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if ( arr[mid ] == target) {
                return true;
            }

            else if ( target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid +1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 0;

        while (target != 10) {
            System.out.printf("%d exists in arr: %b%n", target, printInRangeAndFindTargetInSortedArray(arr, target));
            target++;
        }
    }
}
