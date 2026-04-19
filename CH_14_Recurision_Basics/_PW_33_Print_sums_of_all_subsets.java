package CH_14_Recurision_Basics;

public class _PW_33_Print_sums_of_all_subsets {
    public static void sumOfSubsetsOfString (int arr[] , int idx , int sum) {

        if(idx >= arr.length) {
            System.out.println(sum);
            return;
        }

        // curr idx + sum
        sumOfSubsetsOfString(arr, idx +1 , sum + arr[idx]);

        //curr ans
        sumOfSubsetsOfString(arr , idx +1 , sum);
    }


    public static void main(String[] args) {
        int arr[] = {2,4,5};
        sumOfSubsetsOfString(arr, 0 , 0);
    }
}
