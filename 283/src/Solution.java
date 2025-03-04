public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null) return;
        int count = 0;
        for (int num : nums) {
            if (num != 0) nums[count++] = num;
        }
        for (int i = count; i < nums.length; i++) nums[i] = 0;
    }
}
