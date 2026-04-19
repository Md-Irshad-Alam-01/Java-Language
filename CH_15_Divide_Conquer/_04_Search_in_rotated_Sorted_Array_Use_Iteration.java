package CH_15_Divide_Conquer;

public class _4_Search_in_rotated_Sorted_Array_Use_Iteration {
    public static int searchInRotatedSortedArrayUseIteration ( int arr[] , int target) {
        int start = 0 , end = arr.length-1;

        while ( start <= end) {

            int mid = start + ( end - start)/2;

            if ( arr[mid ] == target) {
                return mid;
            }

            if ( arr[start ] <= arr[mid]) {
                if ( arr[start] <= target && target < arr[mid]) {
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (arr[mid] < target && target <= arr [mid]) {
                    start = mid+1;
                }
                else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3};
        int target = 0 ;
        System.out.println(searchInRotatedSortedArrayUseIteration(arr, target));
    }
}
