package CH_15_Divide_Conquer;

public class _PW_12_Search_Elements_In_Rotated_Duplicate_Sorted_Array {
    public static int findTargetIndex ( int arr[] , int target) {
        int start = 0 ;
        int end = arr.length-1 ;

        while ( start <= end ) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                start++;
                end--;
            }
            else if (arr[mid] <= arr[end]) {
                if ( target > arr[mid] && target <= arr[end]) {
                    start = mid +1;
                }
                else {
                    end = mid -1;
                }
            }
            else {
                if ( target >= arr[start] && target < arr[ mid]) {
                    end = mid -1;
                }
                else {
                    start= mid +1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,3};
        int target = 1;
        int target1 = 2;
        System.out.println(findTargetIndex(arr,target));
        System.out.println(findTargetIndex(arr,target1));
    }
}
