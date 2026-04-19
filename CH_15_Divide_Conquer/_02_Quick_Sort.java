package CH_15_Divide_Conquer;

public class _2_Quick_Sort {
    public static void printQuickSort ( int arr[] , int start , int end) {

        if ( start >= end) {
            return;
        }

        //last element
        int pivotIndex = partition(arr , start , end);

        printQuickSort(arr, start , pivotIndex-1); // left part
        printQuickSort(arr, pivotIndex+1 , end); // right part
    }

    public static int partition ( int arr [] , int start , int end) {
        int pivot = arr[end];
        int i = start -1 ; // to make place for smaller than pivot
        for ( int j = start ; j < end ; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i ;
    }

    public static void printArr ( int arr[]) {
        for ( int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6,5,3,8,9,2,1};
        printQuickSort(arr , 0 , arr.length-1);
        printArr(arr);
    }
}
