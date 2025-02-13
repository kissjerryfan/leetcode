class Solution {
    public int rob(int[] nums) {
        int f0 = 0;
        int f1 = 0;
        for (int num : nums) {
            int newF = Math.max(f1, f0 + num);
            f0 = f1;
            f1 = newF;
        }
        return f1;
    }
}
