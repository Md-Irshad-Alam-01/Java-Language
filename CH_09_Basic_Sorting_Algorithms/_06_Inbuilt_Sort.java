package CH_9_Basic_Sorting_Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class _6_Inbuilt_Sort {
    public static void inbuiltSort ( int arr[]) {
        Arrays.sort(arr);
    }
    public static void printArr ( int arr[])
    {
        for ( int i = 0 ; i < arr.length; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,1,6,3,9,0};
        inbuiltSort(arr);
        printArr(arr);
    }
}
