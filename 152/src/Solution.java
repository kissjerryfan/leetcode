class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int fMax = 1;
        int fMin = 1;
        for (int x : nums) {
            int mx = fMax;
            fMax = Math.max(Math.max(fMax*x,fMin*x),x);
            fMin = Math.min(Math.min(fMax*x,fMin*x),x);
            ans = Math.max(ans,fMax);
        }
        return ans;
    }
}
