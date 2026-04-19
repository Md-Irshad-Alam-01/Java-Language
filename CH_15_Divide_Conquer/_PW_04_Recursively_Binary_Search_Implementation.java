package CH_15_Divide_Conquer;

public class _PW_4_Recursively_Binary_Search_Implementation {
    public static boolean recursivelyBinarySearchImplementation ( int arr[] , int start , int end , int target) {

        if ( start > end ) {
            return false ;
        }

        int mid = start + ( end - start) / 2;
        if ( target == arr[mid]) {
            return true;
        }
        else if ( target < arr[mid] ) {
            return recursivelyBinarySearchImplementation(arr,start , mid - 1, target);
        }
        else {
            return recursivelyBinarySearchImplementation(arr,mid+1,end , target);
        }
    }

    public static void main(String[] args) {
        int arr[] =  {2,3,4,5,6,8,85,3,2,1};
        int target1 =  4;
        int target2 = 7;
        System.out.println(recursivelyBinarySearchImplementation(arr,0,arr.length-1,target1));
        System.out.println(recursivelyBinarySearchImplementation(arr , 0 , arr.length-1 , target2));
    }
}
