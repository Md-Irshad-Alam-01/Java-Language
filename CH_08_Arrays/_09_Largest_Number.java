package CH_8_Arrays;

public class _9_Largest_Number {
    public static int findLargest ( int arr[]) {
        int largest = Integer.MIN_VALUE;
        for ( int i = 0; i < arr.length; i++) {
            if ( largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println("Find the largest number in the array");
        int arr[] = {42,5,6,2,5,43,2,35,6,3,321,43,1};
        System.out.println("Your largest number in the array is = " +findLargest(arr));
    }

}
