package CH_9_Basic_Sorting_Algorithms;

public class _15_Count_Sort {
    public static void basicCountSort ( int arr[]) {
        int max = findMax(arr);
        int freq[] = new int[max + 1];
        for ( int i = 0 ; i < arr.length; i++) {
            freq[arr[i]] ++;
        }
        int k = 0 ;
        for ( int i =  0 ; i < freq.length ; i++) {
            for ( int j = 0 ; j < freq[i] ; j++) {
                arr[k++] = i;
            }
        }
    }
    public static int findMax ( int arr[]) {
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void printArr ( int arr[]) {
        for ( int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,5,2,3,2,1};
        basicCountSort(arr);
        printArr(arr);
    }
}
