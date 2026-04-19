package CH_8_Arrays;

public class _8_Smallest_Number {
    public static int findSmallest ( int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for ( int i = 0; i < arr.length; i++) {
            if ( smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println("Find the smallest number in the array");
        int arr[] = {2,3,46,2,5,6,2,1} ;
        System.out.println("Your smallest number in the array is =" + findSmallest(arr));
    }
}
