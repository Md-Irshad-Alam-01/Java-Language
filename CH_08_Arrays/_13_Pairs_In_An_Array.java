package CH_8_Arrays;

public class _13_Pairs_In_An_Array {
    public static void pairsInArray ( int arr[]) {
        for ( int i =  0; i < arr.length; i++) {
            int curr = arr[i];
            for ( int j = i+1; j < arr.length; j ++) {
                System.out.print("( " + curr + " , " + arr[j] +" )");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]  = {2,3,4,5,6,7,8,9};
        pairsInArray(arr);
    }
}
// Time Complexity = O(n2)