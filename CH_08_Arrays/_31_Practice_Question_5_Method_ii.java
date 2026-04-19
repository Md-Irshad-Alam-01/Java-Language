package CH_8_Arrays;

import java.util.*;

public class _31_Practice_Question_5_Method_ii {
    public static List<List<Integer>> triplesNum (int num[]) {
        List<List<Integer>> result = new ArrayList<>();
        int n = num.length;
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int target = -num[i];
            Set<Integer> s = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = target - num[j];
                if (s.contains(third)) {
                    List<Integer> trip = Arrays.asList(num[i], num[j], third);
                    Collections.sort(trip);
                    uniqueTriplets.add(trip);
                }
                s.add(num[j]);
            }
        }
        return new ArrayList<>(uniqueTriplets);
    }

    public static void main(String[] args) {
        int num[] ={-1,0,1,2,-1,4};
        System.out.println(triplesNum(num));
    }
}
