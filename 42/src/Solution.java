class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length - 1;
        int preMax = 0;
        int sufMax = 0;
        while (left <= right) {
            preMax = Math.max(preMax,height[left]);
            sufMax = Math.max(sufMax,height[right]);
            if (preMax < sufMax) {
                ans += preMax - height[left];
                left++;
            } else {
                ans += sufMax - height[right];
                right--;
            }
        }
        return ans;
    }
}
