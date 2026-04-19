package CH_14_Recurision_Basics;

public class _PW_19_find_number_in_the_given_array_ii {
    public static boolean findNumberInGivenArray ( int arr[] , int idx , int target) {

        //Base case
        if ( idx < 0) {
            return false;
        }

        if (arr[idx] == target) {
            return true;
        }

        return findNumberInGivenArray(arr, idx - 1 , target);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 6, 8, 4};
        int target1 = 5;
        int target2 = 9;

        System.out.println(findNumberInGivenArray(arr, arr.length - 1, target1));
        System.out.println(findNumberInGivenArray(arr, arr.length - 1, target2));
    }
}
