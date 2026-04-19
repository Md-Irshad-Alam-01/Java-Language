package CH_8_Arrays;

public class _14_Pairs_In_An_Array_With_Total_Pairs {
    public static void pairsInAnArrayWith_TotalPairs (int arr[]) {
        int totalPair =0;
        for ( int i = 0; i <arr.length; i++) {
            int curr = arr[i];
            for ( int j = i+1; j < arr.length; j++) {
                System.out.print(" ( " + curr + "," + arr[j] +")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Your total pair of an array is = " +totalPair);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,0,1};
        System.out.println("Your pairs in array:");
        pairsInAnArrayWith_TotalPairs(arr);
    }
}
