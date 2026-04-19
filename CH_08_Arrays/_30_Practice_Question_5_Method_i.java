package CH_8_Arrays;

import java.util.*;

public class _30_Practice_Question_5_Method_i {
    public static List<List<Integer>> triplesNum ( int num[]) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0 ; i < num.length; i++) {
            for ( int j = i+1; j < num.length; j++) {
                for ( int k = j+1; k < num.length; k++) {
                    if ( num[i] + num[j] + num[k] == 0) {
                        List<Integer> triplet =Arrays.asList(num[i], num[j] ,num[k]);
                        Collections.sort(triplet);
                        if(!result.contains(triplet)) {
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num[] ={-1,0,1,2,-1,4};
        System.out.println(triplesNum(num));
    }
}
