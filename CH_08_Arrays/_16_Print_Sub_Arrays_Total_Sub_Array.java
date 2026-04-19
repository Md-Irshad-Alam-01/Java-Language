package CH_8_Arrays;

public class _16_Print_Sub_Arrays_Total_Sub_Array {
    public static void printSubArrAyWith_TotalSubArray ( int arr[]) {
        int totalSubArray = 0;
        for ( int i = 0 ; i < arr.length; i++) {
            int start = i;
            for ( int j = i; j < arr.length; j++) {
                int end = j;
                for ( int k = start; k <= end ; k++) {
                    System.out.print(arr[k] +" ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Your total sub array of the array is = " +totalSubArray);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Your sub array is :");
        printSubArrAyWith_TotalSubArray(arr);
    }
}
