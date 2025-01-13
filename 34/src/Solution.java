class Solution {
    private int lowerBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public int[] searchRange(int[] nums, int target) {
        int start = lowerBound(nums,target);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }
        int end = lowerBound(nums, target + 1) - 1;
        return new int[]{start, end};
    }
}
