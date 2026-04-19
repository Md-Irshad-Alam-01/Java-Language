package CH_15_Divide_Conquer;

public class _PW_6_Find_last_occurrence_in_Array {
    public static int findLastOccurrence ( int arr[] , int target , int index) {

        int start = 0 ;
        int end = arr.length-1 ;

        while (start <= end ) {

            int mid = start +( end - start) / 2;

            if ( target == arr[mid]) {
                index = mid ;
                start = mid +1;
            }

            else if (target < arr[mid]) {
                end= mid - 1;
            }
            else {
                start = mid +1;
            }
        }

        return index;

    }


    public static void main(String[] args) {
        int arr[] = {1,5,5,5,6,6};
        int target1 = 6;
        int target2 = 5;
        System.out.println(findLastOccurrence(arr,target1,-1));
        System.out.println(findLastOccurrence(arr, target2, -1));
    }

}
