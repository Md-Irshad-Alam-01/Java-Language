package CH_16_Time_And_Space_Complexity;

public class _07_Merge_Sort {
    public static void mergeSort ( int arr[] ,  int left , int right ) {
        if ( left >= right ) {
            return ;
        }

        int mid = (left + right) / 2;
        mergeSort(arr, left , mid);
        mergeSort(arr , mid+1 , right);
        merge ( arr, left , mid , right);
    }

    public static void merge (int arr[], int left , int mid , int right) {
        int n1 = mid - left + 1; // right side array
        int n2 = right - mid; // left side array

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        //copy left half
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        // copy right half
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        //Merge two sort half
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void printArr ( int arr[]) {
        for (int i = 0 ; i < arr.length ;i++ ) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,7,3,2,9,8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}

//best , average and worst time complexity = O(n log n)

//Space complexity  = O(n)