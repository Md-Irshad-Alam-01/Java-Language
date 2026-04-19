package CH_9_Basic_Sorting_Algorithms;

public class _2_Selection_Sort_Increasing_Order {
    public static void selectionSort ( int arr[]) {
        for ( int i = 0 ; i < arr.length-1; i++) {
            int minPos = i;
            for ( int j = i; j < arr.length; j++) {
                if ( arr[minPos] > arr[j]) {
                    minPos= j;
                }
            }
            //swap
            int temp = arr[minPos] ;
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr ( int arr[]) {
        for ( int i = 0 ; i < arr.length; i++ ) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,1,6,3,9,0};
        selectionSort(arr);
        printArr(arr);
    }
}
//Time Complexity = O(n2)
