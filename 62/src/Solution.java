public class Solution {
    public int uniquePaths(int m, int n) {
        int[] f = new int[n+1];
        f[1] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                f[j+1] += f[j];
            }
        }
        return f[n];
    }
}
