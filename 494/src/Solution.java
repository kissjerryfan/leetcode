class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int s = 0;
        for (int x : nums) {
            s += x;
        }
        s -= Math.abs(target);
        if (s < 0 || s % 2 == 1) {
            return 0;
        }
        int m = s / 2;
        int[] f = new int[m+1];
        f[0] = 1;
        for (int num : nums) {
            for (int i = m; i >= num; i--) {
                f[i] += f[i-num];
            }
        }
        return f[m];
    }
}
