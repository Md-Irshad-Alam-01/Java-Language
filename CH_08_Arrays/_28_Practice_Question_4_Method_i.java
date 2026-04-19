package CH_8_Arrays;

public class _28_Practice_Question_4_Method_i {
    public static int trapWater ( int height[]) {
        int n = height.length;
        int leftMAx[] = new int [n];
        int rightMax[] = new int[n];
        leftMAx[0] = height[0];
        rightMax[n-1] = height[n-1];
        for ( int i = 1 ; i < n ; i++) {
            leftMAx[i] = Math.max(leftMAx[i-1], height[i]);
        }
        for ( int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int ans = 0;
        for ( int i = 0 ; i < n; i++) {
            ans += Math.min(leftMAx[i] , rightMax[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int height[]  = { 0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapWater(height));
    }
}
