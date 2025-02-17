class Solution {
    private int ans;
    public int totalNQueens(int n) {
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];
        dfs(0,n,col,diag1,diag2);
        return ans;
    }
    private void dfs(int r, int n, boolean[] col, boolean[] diag1, boolean[] diag2) {
        if (r == n) {
            ans++;
            return;
        }
        for (int c = 0; c < n; c++) {
            int rc = r - c + n - 1;
            if (!col[c] && !diag1[r+c] && !diag2[rc]) {
                col[c] = diag1[r+c] = diag2[rc] = true;
                dfs(r+1,n,col,diag1,diag2);
                col[c] = diag1[r+c] = diag2[rc] = false;
            }
        }
    }
}
