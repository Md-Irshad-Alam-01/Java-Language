package CH_15_Divide_Conquer;

public class _PW_15_Find_Peak_Index_in_Mountain_Array {
    public static int peakIndexInMountainArray ( int arr[]) {

        int ans = -1;
        int start = 0 ;
        int end = arr.length-1;

        while ( start <= end ) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                ans = mid + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = {0,4,1,0};
        int arr2[] = {0,5,4,10,5,2};
        System.out.println(peakIndexInMountainArray(arr1));
        System.out.println(peakIndexInMountainArray(arr2));
    }
}

