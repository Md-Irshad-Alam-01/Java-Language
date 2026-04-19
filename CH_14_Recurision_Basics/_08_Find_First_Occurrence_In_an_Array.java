package CH_14_Recurision_Basics;

public class _8_Find_First_Occurrence_In_an_Array {
    public static int firstOccurrence ( int arr[] , int key , int i) {

        if ( i == arr.length) {
            return -1;
        }

        if ( arr[i] == key ) {
            return i;
        }

        return firstOccurrence(arr, key , i+1);
    }

    public static void main(String[] args) {
        int arr[] = {2,51,3,5,1};
        int key1 = 6;
        int key2 = 51;
        int key3 = 1;
        int key4 = 2;

        System.out.println(firstOccurrence(arr,key1,0));
        System.out.println(firstOccurrence(arr,key2,0));
        System.out.println(firstOccurrence(arr,key3,0));
        System.out.println(firstOccurrence(arr,key4,0));
    }

}
