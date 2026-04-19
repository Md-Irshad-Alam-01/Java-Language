package CH_14_Recurision_Basics;

public class _PW_15_An_array_print_all_its_value_recursively {
    public static void printArray ( int arr[] , int idx) {

        if ( idx == arr.length ) {
            return;
        }

        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1);

    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        printArray(arr,0);
    }
}
