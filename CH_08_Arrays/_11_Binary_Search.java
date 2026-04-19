package CH_8_Arrays;

public class _11_Binary_Search {
    public static int binarySearch ( int arr[] , int key) {
        int start = 0 , end = arr.length-1;
        while ( start <= end) {
            int mid = (start + end ) / 2;
            if ( arr[mid] == key) {
                return mid ;
            }
            if ( arr[mid] < key ){
            start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2,4,43,3,75,6,31};
        int key = 3;
        int index = binarySearch(arr,key);
        System.out.println("Your index of an array for key is = " +index);
    }
}
//Time Complexity = O(log n)