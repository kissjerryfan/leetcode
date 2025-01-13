class Solution {
    private static int lowerBound(int[] nums, int target) {
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
    public static int maximumCount(int[] nums) {
        int pos = nums.length - lowerBound(nums, 1);
        int neg = lowerBound(nums, 0);
        return Math.max(pos, neg);
    }

    public static void main(String[] args) {
        int[] nums = {-1764,-1562,-1226,-1216,-402,-386,-133,979,1227,1992};
        int num = maximumCount(nums);
        System.out.println(num);
    }
}
