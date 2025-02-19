class Solution {
    public boolean canPartition(int[] nums) {
        int s = 0;
        for (int num : nums) {
            s += num;
        }
        if(s % 2 != 0) return false;
        s /= 2;
        boolean[] f = new boolean[s+1];
        int s2 = 0;
        f[0] = true;
        for (int x : nums) {
            s2 = Math.min(s2+x,s);
            for (int j = s2; j >= x; j--) {
                f[j] = f[j] || f[j-x];
            }
            if (f[s]) {
                return true;
            }
        }
        return false;
    }
}
