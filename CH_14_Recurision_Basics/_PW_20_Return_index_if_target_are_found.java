package CH_14_Recurision_Basics;

public class _PW_20_Return_index_if_target_are_found {
    public static int findIndexIfTargetAreFound ( int arr[] , int idx , int target) {

        if ( idx >= arr.length) {
            return -1;
        }

        if ( arr[idx] == target) {
            return idx;
        }

        return findIndexIfTargetAreFound(arr,idx+1, target);

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 6, 8, 4};
        int target1 = 5;
        int target2 = 9;

        System.out.println(findIndexIfTargetAreFound(arr,0,target1));
        System.out.println(findIndexIfTargetAreFound(arr,0,target2));
    }
}
