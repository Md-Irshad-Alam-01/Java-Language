package CH_15_Divide_Conquer;

public class _PW_16_Find_Peak_Element_Problem {
    public static int findPeakElement  ( int arr[]) {

        int n = arr.length ;
        int start = 0 ;
        int end = n - 1;

        while ( start <= end ) {
            int mid = start + ( end - start) /2;

            if ( (mid == 0 || arr[mid] > arr[mid -1]) &&
                    (mid == n -1 || arr[mid] > arr[mid+1])) {
                return mid ;
            }
            if ( arr[mid ] < arr[mid +1]) { // for ascending or up hill
                start = mid +1;
            }
            else { // for descending or down hill
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,1};
        int arr2[] = {1,2,3,4,5,6};
        int arr3[] = {6,5,4,3,2,1};
        System.out.println(findPeakElement(arr1));
        System.out.println(findPeakElement(arr2));
        System.out.println(findPeakElement(arr3));
    }
}
