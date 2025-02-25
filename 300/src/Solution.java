class Solution {
    public int lengthOfLIS(int[] nums) {
        int ng = 0;
        for (int x : nums) {
            int j = lowerBound(nums,ng,x);
            nums[j] = x;
            if (ng == j) {
                ng++;
            }
        }
        return ng;
    }
    private int lowerBound(int[] nums, int right, int target) {
        int left = -1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
