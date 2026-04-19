package CH_14_Recurision_Basics;

public class _PW_21_Find_all_integer_index_in_the_array {
    public static void findAllIntegerIndexInTheArray ( int arr[] , int idx , int target) {

        if ( idx >= arr.length) {
            return ;
        }

        if ( arr[idx] == target) {
            System.out.print(idx+",");
        }

        findAllIntegerIndexInTheArray(arr , idx + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = {5,3,6,3,2,5,4,3,2,24,2,6,2};
        int target1 = 5;
        int target2 = 2;
        int target3 = 3;
        int target4 = 9;

        findAllIntegerIndexInTheArray(arr,0,target1);
        System.out.println();
        findAllIntegerIndexInTheArray(arr,0,target2);
        System.out.println();
        findAllIntegerIndexInTheArray(arr,0,target3);
        System.out.println();
        findAllIntegerIndexInTheArray(arr,0,target4);
    }
}
