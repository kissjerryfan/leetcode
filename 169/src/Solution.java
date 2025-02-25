class Solution {
    public int majorityElement(int[] nums) {
        int x = 0, votes = 0, count = 0;
        for (int num : nums) {
            if (votes == 0) x = num;
            votes += x == num ? 1 : -1;
        }
        for (int num : nums) {
            if (x == num) count++;
        }
        return count > nums.length / 2 ? x : 0;
    }
}
