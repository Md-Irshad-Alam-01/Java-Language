package CH_8_Arrays;

import java.util.*;

public class _25_Question {
    public static void reverseAtIndex ( int arr[] , int key) {
        if ( key > arr.length ) {
            System.out.println("Invalid rotation");
            return;
        }
        int index = 0;
        int rotate[] = new int[arr.length];
        for (int i = key; i < arr.length; i++){
            rotate[index++] = arr[i];
        }
        for ( int i = 0; i < key ; i++) {
            rotate[index++] = arr[i];
        }
        System.out.println(Arrays.toString(rotate));
    }

    public static void main(String[] args) {
        System.out.println("There is an integer array num sorted in ascending order (with distinct values). \n" +
                "Prior to being passed to your function, num is possibly rotated at an unknown \n" +
                "pivot index k (1 <= k < num.length) such that the resulting array is [num[k], \n" +
                "num[k+1], ..., num[n-1], num[0], num[1], ..., num[k-1]] (0-indexed). For \n" +
                "example, [0,1,2,4,5,6,7] might be rotated\n" +
                " at pivot index 3 and \n" +
                "become [4,5,6,7,0,1,2]. \n" );
        int arr[] = {0,1,2,4,5,6,7};
        System.out.print("Enter your array = ");
        for ( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        int key = 4;
        System.out.print("\nYour rotated array at the given point is = ");
        reverseAtIndex(arr,key);
    }
}
