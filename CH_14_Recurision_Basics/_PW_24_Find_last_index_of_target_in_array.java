package CH_14_Recurision_Basics;

public class _PW_24_Find_last_index_of_target_in_array {
    public static int findLastIndexInArray ( int arr[] , int idx , int target) {

        if (idx >=  arr.length) {
            return -1;
        }

        int found = findLastIndexInArray(arr, idx +1 , target);
        if (found == -1  &&  arr[idx] == target) {
            return idx;
        }

        return found;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,7,4,2,6,8,3,2,1,2};
        int target = 2;
        System.out.println(findLastIndexInArray(arr, 0 , target));
    }
}
