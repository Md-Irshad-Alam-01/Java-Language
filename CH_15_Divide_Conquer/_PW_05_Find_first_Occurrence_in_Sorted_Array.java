package CH_15_Divide_Conquer;

public class _PW_5_Find_first_Occurrence_in_Sorted_Array {
    public static int findFirstOccurrenceInSortedArray ( int arr[] , int target ,int index) {

        int start = 0 ;
        int end = arr.length-1;


        while ( start <= end ) {
            int mid = start +( end - start ) / 2;

            if (target == arr[mid] ) {
                index = mid ;
                end = mid - 1;
            }
            else if ( target < arr[mid]) {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,5,5,6,6};
        int target = 6;
        System.out.println(findFirstOccurrenceInSortedArray(arr,target,-1));
    }
}
