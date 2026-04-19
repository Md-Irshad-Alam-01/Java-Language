package CH_14_Recurision_Basics;

public class _PW_17_Find_Sum_of_the_elements_of_the_array {
    public static int sumOfTheArray ( int arr[] , int idx) {

        if (idx == arr.length) {
            return 0;
        }

        int smallAns = sumOfTheArray(arr, idx+1);
        int ans = arr[idx] + smallAns;

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5} ;
        System.out.println(sumOfTheArray(arr, 0));
    }
}
