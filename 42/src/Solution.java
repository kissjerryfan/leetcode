class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int preMax = 0;
        int sufMax = 0;
        int left = 0;
        int right = height.length - 1;
        while (left <= right) {
            preMax = Math.max(height[left],preMax);
            sufMax = Math.max(height[right],sufMax);
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
