package CH_9_Basic_Sorting_Algorithms;

public class _16_Count_Sort_Stable_Method {
    public static int findMax ( int arr[]) {
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void countSort ( int arr[]) {
        int n = arr.length;
        int output[] = new int[n];
        int max = findMax(arr);
        int count[] = new int[max+1];
        for ( int i = 0 ; i < n; i++) {
            count[arr[i]]++;
        }

        //make prefix sum array of count array
        for ( int i = 1 ; i < count.length; i++) {
            count[i] += count[i-1];
        }

        //find the index of each element in the original array and put it in output array
        for ( int i = n-1; i >= 0 ; i--) {
            int idx = count[arr[i]] -1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        //copy all element of output to arr
        for ( int i = 0 ; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void printArr ( int arr[] ) {
        for ( int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,4,2,5,2,3};
        countSort(arr);
        printArr(arr);
    }
}
