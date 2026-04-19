package CH_8_Arrays;

public class _12_Reverse_An_Array {
    public static void reverseAnArray ( int arr[]) {
        int first = 0;
        int last = arr.length-1;
        while ( first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Reverse an array:");
        int arr[] =  {2,24,53,5,2,6,8,9};
        reverseAnArray(arr);
        System.out.println("Your reverse of an array is :");
        for ( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
//Time Complexity = O (n)
//Space Complexity = O (1)