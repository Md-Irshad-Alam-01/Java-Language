package CH_14_Recurision_Basics;

public class _PW_34_Frog_Jump_find_min_cost_to_reach_N {
    public static int frogJumpFindMinCostToReachN ( int arr[] , int idx) {

        if ( idx == arr.length-1) {
            return 0;
        }

        int option1 = Math.abs(arr[idx] - arr[idx+1]) + frogJumpFindMinCostToReachN(arr,idx+1);

        if ( idx == arr.length-2) {
            return option1;
        }

        int option2 = Math.abs(arr[idx] - arr[idx+2]) + frogJumpFindMinCostToReachN(arr, idx+2);

        return Math.min(option1,option2);
    }

    public static void main(String[] args) {
        int arr[] = {10,30,40,20};
        System.out.println(frogJumpFindMinCostToReachN(arr,0));
    }
}
