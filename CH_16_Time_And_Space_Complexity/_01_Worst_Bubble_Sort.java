package CH_16_Time_And_Space_Complexity;

public class _01_Worst_Bubble_Sort {
    public static void BubbleSort ( int arr[]) {
        for ( int i = 0; i < arr.length - 1 ; i++) {
            for ( int j  = 0 ; j < arr.length -1 - i ; j++) {
                if ( arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void PrintArr( int arr[]) {
        for ( int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,6,5,3};
        BubbleSort(arr);
        PrintArr(arr);
    }
}

//Worst Time Complexity = O(n^2)