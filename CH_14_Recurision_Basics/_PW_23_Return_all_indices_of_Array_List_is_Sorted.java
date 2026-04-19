package CH_14_Recurision_Basics;

import java.util.ArrayList;

public class _PW_23_Return_all_indices_of_Array_List_is_Sorted {
    public static ArrayList<Integer> returnAllIndicesOfArray (int arr[] , int idx , int target) {

        //Base case
        if ( idx >= arr.length || arr[idx] > target) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();

        //Self Work
        if ( arr[idx] == target) {
            ans.add(idx);
        }

        //Recursive Work
        ArrayList<Integer>  smallAns = returnAllIndicesOfArray(arr, idx + 1, target);
        ans.addAll(smallAns);

        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = { 1,1,1,2,2,2,2,2,4,4,4,4,4,6,6};
        int arr2[] = { 1,1,1,2,2,2,3,5,3,25,3,212,2,4,4,4,4,4,6,6};
        int target = 2;

        ArrayList<Integer> ans1 = returnAllIndicesOfArray(arr1, 0, target);
        ArrayList<Integer> ans2 = returnAllIndicesOfArray(arr2, 0, target);

        //for ans 1 i.e sorted
        if ( ans1.isEmpty()) {
            System.out.println("Element " + target + "is not found");
        }
        else {
            for (Integer i : ans1) {
                System.out.print(i+",");
            }
        }

        //for ans2 and i.e unsorted
        if ( ans2.isEmpty()) {
            System.out.println("Element " + target + "is not found");
        }
        else {
            for (Integer i : ans2) {
                System.out.print(i+",");
            }
        }
    }
}
