package CH_8_Arrays;

public class _29_Problem_Question_4_Method_ii {
    public static int trapWater ( int height[]) {
        int n  = height.length;
        int ans = 0 ;
        int left = 0 ;
        int right = n-1;
        int leftMax  = 0;
        int rightMax = 0;
        while ( left < right) {
            leftMax = Math.max(leftMax , height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                ans += leftMax - height[left];
                left++;
            }
            else {
                ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapWater(height));
    }
}
