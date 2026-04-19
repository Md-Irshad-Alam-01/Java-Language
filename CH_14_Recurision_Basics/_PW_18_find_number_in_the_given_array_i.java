package CH_14_Recurision_Basics;

public class _PW_18_find_number_in_the_given_array_i {
    public static boolean findNumberInTheArray ( int arr[] , int idx , int target) {

        if ( idx == arr.length) {
            return false;
        }

        if (arr[idx] == target ) {
            return true;
        }

        return findNumberInTheArray(arr, idx+1,target);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,1,6,8,4} ;
        int target1 = 5;
        int target2 = 9;
        System.out.println(findNumberInTheArray(arr,0,target1));
        System.out.println(findNumberInTheArray(arr,0, target2));
    }
}
