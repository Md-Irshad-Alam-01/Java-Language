package CH_17_Backtracking;

public class _03_Find_Permutation {
     public static void findPermutation ( String str, String ans) {

         //base case
         if ( str.length() == 0) {
             System.out.print(ans);
             return;
         }

         //recursion
         for ( int i = 0 ; i < str.length() ; i++) {
             char curr = str.charAt(i);
             //"a b c d e" remove c
             // "a b" + "de" = "a b d e"

             String newStr = str.substring(0 , i) + str.substring(i+1);
             findPermutation(newStr, ans+curr);
         }
     }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str ," ");
    }
}


//Time Complexity = O(n*n!)