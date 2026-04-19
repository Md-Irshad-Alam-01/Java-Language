package CH_8_Arrays;

public class _17_Print_sum_of_sub_array_Find_Max_and_Min {
    public static void printSubArrayAndSum_FindMaxAndMin ( int arr[]) {
        int currSum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for ( int i = 0 ; i < arr.length; i++) {
            int start = i;
            for ( int j = i ; j < arr.length; j++) {
                int end = j;
                currSum= 0;
                for ( int k = start; k <= end; k++) {
                    currSum+=arr[k];
                    System.out.print(arr[k] + " " );
                }
                System.out.print("Sum = "+currSum);
                System.out.println();
                if (max < currSum){
                    max = currSum;
                }
                if ( min >currSum) {
                    min = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Your maximum sum number of an sub array is = " +max);
        System.out.println("Your minimum sum number of an sub array is =  " +min);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printSubArrayAndSum_FindMaxAndMin(arr);
    }
}
