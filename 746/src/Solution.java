class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f0 = 0;
        int f1 = 0;
        for (int i = 1; i < cost.length; i++) {
            int newF = Math.min(f0+cost[i-1],f1+cost[i]);
            f0 = f1;
            f1 = newF;
        }
        return f1;
    }
}
