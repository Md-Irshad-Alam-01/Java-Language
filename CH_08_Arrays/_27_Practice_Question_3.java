package CH_8_Arrays;

public class _27_Practice_Question_3 {
    public static int arraysPrice ( int arr[]) {
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            int buy = i;
            for (int j = i + 1; j < arr.length; j++) {
                int sell = j;
                int sum = arr[sell] - arr[buy];
                if (sum > maxProfit) {
                    maxProfit = sum;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[]  = {7,1,5,3,6,4};
        System.out.println(arraysPrice(arr));
    }
}
