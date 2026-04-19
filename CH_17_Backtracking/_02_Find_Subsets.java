package CH_17_Backtracking;

public class _02_Find_Subsets {
    public static void findSubsets (String str,String ans, int i) {

        //base case
        if ( i == str.length()) {
            if ( ans.length() == 0) {
                System.out.print("null");
            }
            else {
                System.out.print(ans);
            }
            return;
        }

        //yes choice
        findSubsets(str ,ans + str.charAt(i), i+1);

        //no choice
        findSubsets(str , ans , i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str , " ", 0);
    }
}

// Time complexity = O(n^2)
//Time complexity = O(n*2^n)

//Space Complexity = O(n)