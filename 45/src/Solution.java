class Solution {
    public int jump(int[] nums) {
        int length = nums.length;
        int step = 0;
        int maxPosition = 0;
        int end = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                step++;
                end = maxPosition;
                if (end >= length - 1) {
                    return step;
                }
            }
        }
        return step;
    }
}
