package CH_8_Arrays;

import java.util.Scanner;

public class _21_WAP_of_Kadane_Sub_Array_Find_Max_Sub_Array_Sum {

    public static int kadaneMaxSubArraySum ( int arr[]) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for ( int i = 1 ; i < arr.length ; i++  ) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum , currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int  arr[] = new int[n];
        System.out.println("Enter " + n + " elements = " );
        for ( int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = kadaneMaxSubArraySum(arr);
        System.out.println("Maximum sub array sum = "  +result);
    }
}
