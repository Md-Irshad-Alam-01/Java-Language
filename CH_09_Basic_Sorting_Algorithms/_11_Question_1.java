package CH_9_Basic_Sorting_Algorithms;

public class _11_Question_1 {
    public static void moveAll0 ( int arr[]) {
        for ( int i = 0 ; i < arr.length -1 ; i++) {
            for ( int j = 0 ; j < arr.length-i-1; j++) {
                if ( arr[j] == 0  && arr[j+1] != 0) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr ( int arr[]) {
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Given an array arr, move all 0's to the end " +
                "of while maintaining the relative order of the non zeros elements." +
                "Input = 0,5,0,3,4,2 and Output = 5,3,4,2,0,0");
        int arr[] = {0,5,0,3,4,2};
        moveAll0(arr);
        printArr(arr);
    }
}
