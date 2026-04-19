package CH_9_Basic_Sorting_Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class _9_Collections_Reverse_Order_iii {
    public static void collection( Integer arr[] ) {
        Arrays.sort(arr, Collections.reverseOrder());
    }
    public static void printArr ( Integer arr[]) {
        for ( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = {2,4,5,1,6,3,9,0};
        Arrays.sort(arr, 0,3, Collections.reverseOrder());
        //collection(arr);
        printArr(arr);
    }
}
