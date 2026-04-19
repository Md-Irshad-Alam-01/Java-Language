package CH_8_Arrays;

public class _18_Maximum_Sub_Array_Sum_i {
    public static void maximumSubArraySum (int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < arr.length;  i++) {
            int start = i;
            for ( int j = i; j < arr.length;  j++) {
                int  end = j;
                sum = 0;
                for (int k = start ; k <= end ; k++) {
                    System.out.print(arr[k] +" ");
                    sum += arr[k];
                }
                System.out.println(" = "+sum);
                if (max < sum) {
                    max = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sum of the sub array is =" +max);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7};
        maximumSubArraySum(arr);
    }
}
