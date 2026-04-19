package CH_14_Recurision_Basics;

public class _PW_16_Print_max_value_of_the_array {
    public static int  printMaxValueOfTheArray ( int arr[] , int idx) {

        if ( idx == arr.length-1) {
            return arr[idx] ;
        }

        //Small Ans
        int smallAns = printMaxValueOfTheArray(arr, idx + 1);
        return Math.max (arr[idx ], smallAns);


    }

    public static void main(String[] args) {
        int arr[] ={6,4,2,7,9};
        System.out.println(printMaxValueOfTheArray(arr,0));
    }
}
