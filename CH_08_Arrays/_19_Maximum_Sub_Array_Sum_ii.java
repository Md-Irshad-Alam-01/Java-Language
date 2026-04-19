package CH_8_Arrays;

public class _19_Maximum_Sub_Array_Sum_ii {
    public static void printMaxSubArraySum ( int arr[]) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        // calculating prefix array
        for ( int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for ( int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if ( max < currSum) {
                    max= currSum;
                }
            }
        }
        System.out.println("Maximum sum of sub array is = " +max);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,6,7};
        printMaxSubArraySum(arr);
    }
}
//Time Complexity = O (n2)
