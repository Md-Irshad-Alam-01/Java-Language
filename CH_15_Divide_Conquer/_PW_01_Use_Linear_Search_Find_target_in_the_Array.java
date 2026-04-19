package CH_15_Divide_Conquer;

public class _PW_1_Use_Linear_Search_Find_target_in_the_Array {
    public static boolean findTarget ( int arr[] , int target) {
        for ( int i = 0 ; i < arr.length ; i++) {
            if ( arr[i] == target) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[] = {2,1,3,5,3,6,8,9};
        int target = 5;
        System.out.println(findTarget(arr,target));
        int target2 = 7;
        System.out.println(findTarget(arr,target2));
    }
}
