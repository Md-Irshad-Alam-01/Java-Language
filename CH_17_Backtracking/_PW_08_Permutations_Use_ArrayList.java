package CH_17_Backtracking;

import java.util.*;

public class _PW_08_Permutations_Use_ArrayList {
    public static void printPermutation ( String str , String s, List<String> l) {
        if(str.isEmpty()) {
            l.add(s);
            return;
        }

        for ( int  i = 0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring ( 0 , i);
            String right = str.substring (i+1);
            String rem = left + right;
            printPermutation(rem, s +ch , l);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> l = new ArrayList<>();
        printPermutation(str,"",l);
        for ( int i = 0 ; i <l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
