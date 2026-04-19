package CH_14_Recurision_Basics;

public class _6_Check_Array_is_stored_or_not {
    public static boolean numSortedOrNot ( int arr[] , int i ) {

        //Base case
        if (i == arr.length-1) {
            return true ;
        }

        if ( arr[i] > arr[i+1]) {
            return false ;
        }

        return numSortedOrNot(arr, i+1);
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,2,1,5};

        System.out.println(numSortedOrNot(arr1, 0));
        System.out.println(numSortedOrNot(arr2, 0));
    }
}
