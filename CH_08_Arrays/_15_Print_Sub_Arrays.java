package CH_8_Arrays;

public class _15_Print_Sub_Arrays {
    public static void printSubArray ( int arr[]) {
        for ( int i = 0; i <arr.length; i++) {
            int start = i;
            for ( int j = i; j<arr.length; j++) {
                int end = j;
                for ( int k = start ; k <=end ; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        System.out.println("Your sub array is :");
        printSubArray(arr);
    }
}
