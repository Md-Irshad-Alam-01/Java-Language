package CH_16_Time_And_Space_Complexity;

public class _03_Binary_Search {
    public static int binarySearch ( int arr[] , int target) {
        int start = 0;
        int end = arr.length-1;
        while ( start <= end) {
            int mid = (start + end)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 3;
        System.out.println(binarySearch(arr, target));
    }
}

//best time complexity is = 0(1)
//and average time complexity = 0(log n)
//and worst time complexity = 0(log n)