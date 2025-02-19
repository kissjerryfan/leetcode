class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] f = grid[0];
        for (int j = 1; j < n; j++) {
            f[j] += f[j-1];
        }
        for (int i = 1; i < m; i++) {
            f[0] += grid[i][0];
            for (int j = 1; j < n; j++) {
                f[j] = Math.min(f[j],f[j-1]) + grid[i][j];
            }
        }
        return f[n-1];
    }
}
