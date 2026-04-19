package CH_8_Arrays;

public class _10_Largest_And_Smallest {
    public static int largestAndSmallest ( int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ( largest < arr[i]) {
                largest = arr[i];
            }
            if ( smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Your smallest number is the array is = " +smallest);
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,55,667,2,3,6,2,4,23,45,32,1,4,0};
        System.out.println("Your largest number in the array is = " + largestAndSmallest(arr));
    }
}
