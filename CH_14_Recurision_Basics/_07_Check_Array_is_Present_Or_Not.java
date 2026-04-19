package CH_14_Recurision_Basics;

public class _7_Check_Array_is_Present_Or_Not {
    public static boolean arrayStoredOrNot ( int arr[] , int idx , int target) {

        //Base case
        if (idx ==  0) {
            return false ;
        }

        //Recursive call
        if ( arr[idx - 1] == target) {
            return true;
        }

        return arrayStoredOrNot(arr,idx-1 , target);
    }

    public static void main(String[] args) {
        int arr[] = {0,1,5,64,4,7};
        int target1 = 0;
        int target2 = 4;
        int target3 = 11;
        System.out.println(arrayStoredOrNot(arr,arr.length,target1));
        System.out.println(arrayStoredOrNot(arr,arr.length,target2));
        System.out.println(arrayStoredOrNot(arr,arr.length,target3));
    }
}


//Time complexity = O(n)
//Space complexity = O(n)
