package CH_8_Arrays;

import java.util.*;

public class _32_Practice_Question_5_Method_iii {
    public static List<List<Integer>> triplesNum(int num[]) {
        int n = num.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(num);
        for ( int i = 0; i<n; i++) {
            if(i > 0 && num[i] == num[i-1]) {
                continue;
            }
            int j = i + 1 , k = n-1;
            while( j < k) {
                int sum = num[i] + num[j] + num[k] ;
                if (sum < 0) {
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else {
                    ans.add(Arrays.asList(num[i], num[j], num[k]));
                    j++ ;
                    k--;
                    while ( j < k && num[j] == num[j-1]) {
                        j++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num[] ={-1,0,1,2,-1,4};
        System.out.println(triplesNum(num));
    }
}
