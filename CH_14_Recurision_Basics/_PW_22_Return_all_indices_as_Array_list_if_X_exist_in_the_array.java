package CH_14_Recurision_Basics;

import java.util.ArrayList;

public class _PW_22_Return_all_indices_as_Array_list_if_X_exist_in_the_array {
    public static ArrayList<Integer> allIndicesInTheArray ( int arr[], int idx, int target )  {

        ///Base case
        if ( idx >= arr.length) {
            return new ArrayList<>();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        //Self work
        if ( arr[idx] == target) {
            ans.add(idx);
        }

        //Recursive work
        ArrayList<Integer> smallAns = allIndicesInTheArray(arr,idx+1,target);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,6,3,2,5,4,3,2,24,2,6,2};
        int target = 5;

        ArrayList<Integer>ans = allIndicesInTheArray(arr,0,target);

        for (Integer i: ans) {
            System.out.println(i);
        }

    }
}
