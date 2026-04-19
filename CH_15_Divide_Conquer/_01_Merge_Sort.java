package CH_15_Divide_Conquer;

public class _1_Merge_Sort {
    public static void printMergeSort ( int arr[] ,int start , int end) {

        if ( start >= end ) {
            return;
        }

        int mid = start + (end - start) / 2;
        printMergeSort( arr, start ,mid);  //left part
        printMergeSort(arr, mid + 1 , end);  //right part
        merge(arr,start,mid,end);
    }

    public static void merge (int arr[] , int start , int mid , int end) {

        int temp[] = new int [end - start+1];

        int i = start;  //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0;  //iterator for temp arr

        while ( i <= mid && j <= end) {
            if ( arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            }
            else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        //left part
        while (i <= mid ) {
            temp[k++] = arr[i++];
        }

        //right part
        while (j <= end) {
            temp[k++] = arr[j++] ;
        }

        //copy temp to original arr
        for ( k = 0 , i = start ; k < temp.length; k++ , i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArr ( int arr[]) {
        for ( int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6,5,3,8,9,2,1};
        printMergeSort(arr , 0 , arr.length-1);
        printArr(arr);
    }
}
