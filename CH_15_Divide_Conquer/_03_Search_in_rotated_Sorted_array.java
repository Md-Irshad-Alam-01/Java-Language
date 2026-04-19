package CH_15_Divide_Conquer;

public class _3_Search_in_rotated_Sorted_array {
    public static int searchInRotatedSortedArray ( int arr[] , int target , int start , int end) {

        if ( start > end) {
            return -1;
        }

        int mid = start + ( end - start) / 2;

        //case found
        if ( arr[mid] == target) {
            return mid;
        }

        //mid on L1
        if (arr[start] <= arr[mid]) {
            //case a: left
            if ( arr[start] <= target && target < arr[mid]) {
                return searchInRotatedSortedArray(arr , target , start , mid -1);
            }
            else {
                //case b: right
                return searchInRotatedSortedArray(arr , target , mid+1 , end);
            }
        }

        //mid on L2
        else {
            //case c : right
            if( arr[mid] < target && target <= arr[end]) {
                return searchInRotatedSortedArray(arr , target , mid +1 , end);
            }
            else {
                //case d :left
                return searchInRotatedSortedArray(arr , target , start , mid -1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchInRotatedSortedArray(arr, target , 0 , arr.length-1));
    }
}
