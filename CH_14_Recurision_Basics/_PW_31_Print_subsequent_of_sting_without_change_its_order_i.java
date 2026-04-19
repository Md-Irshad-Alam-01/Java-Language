package CH_14_Recurision_Basics;

import java.util.ArrayList;

public class _PW_31_Print_subsequent_of_sting_without_change_its_order_i {
     public static ArrayList<String> getSubsequentOrderOfString ( String str) {

         ArrayList<String> ans = new ArrayList<>();

         //Base case
         if (str.length() == 0) {
            ans.add("");
            return ans;
         }

         char curr = str.charAt(0);  //a


         ArrayList<String> smallAns =  getSubsequentOrderOfString(str.substring(1));
         //small Ans = ["bc" , "b" , "c" , " "]

         for (String ss : smallAns){
             ans.add(ss);  //  currAns = ["abc" , "ab" , "ac" , "a"]
             ans.add(curr +ss);
         }

         return ans; // final ans = ["bc" , "b" , "c" , " " , "abc" , "ab" , "ac" , "a"]
     }

    public static void main(String[] args) {
        ArrayList<String> ans = getSubsequentOrderOfString("abc");
        for (String ss : ans) {
            System.out.println(ss+ " ");
        }
    }
}
