package CH_15_Divide_Conquer;

public class _PW_10_Pattern_Searching_in_Rotated_Sorted_Array {
    public static int findMin (int arr[]) {
        int start = 0 ;
        int end = arr.length-1;
        int ans = -1;

        while ( start <= end) {
            int mid = start + (end - start)  / 2;
            if ( arr[mid ] <= arr[end]) {
                ans = mid ;
                end = mid -1 ;
            }
            else {
                start = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = {3,4,5,1,2};
        int arr2[] = { 2,3,4,5,1};
        System.out.println(findMin(arr1));
        System.out.println(findMin(arr2));
    }
}
