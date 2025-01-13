class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = -1;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[n-1]) {
                left = nums[mid];
            } else {
                right = nums[mid];
            }
        }
        return nums[right];
    }
}
