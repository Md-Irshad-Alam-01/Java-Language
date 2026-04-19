package CH_8_Arrays;

public class _20_Max_Sub_Array_by_Kadane_Algorithm {
    public static void kadaneAlgorithm (int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for ( int i = 0 ; i  < arr.length; i++) {
            currSum = currSum + arr[i];
            if ( currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Our Maximum sub array sum is =  " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadaneAlgorithm(arr);
    }
}
//Time Complexity = O (n)