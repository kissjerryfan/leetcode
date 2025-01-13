class Solution {
    private boolean isBlue(int[] nums, int target, int mid) {
        int x = nums[mid];
        int n = nums.length;
        int end = nums[n-1];
        if (x > end) {
            return x >= target && target > end;
        }
        return x >= target || target > end;
    }
    public int search(int[] nums, int target) {
        int left = -1;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (isBlue(nums,target,mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return nums[right] == target ? right : -1;
    }
}
