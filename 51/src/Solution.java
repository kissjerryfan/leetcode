import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int[] queens = new int[n];
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];
        dfs(0, n, queens, col, diag1, diag2, ans);
        return ans;
    }
    private void dfs(int r, int n, int[] queens, boolean[] col, boolean[] diag1, boolean[] diag2, List<List<String>> ans) {
        if (r == n) {
            List<String> board = new ArrayList<>(n);
            for (int c : queens) {
                char[] row = new char[n];
                Arrays.fill(row,'.');
                row[c] = 'Q';
                board.add(new String(row));
            }
            ans.add(board);
            return;
        }
        for (int c = 0; c < n; c++) {
            int rc = r - c + n - 1;
            if (!col[c] && !diag1[r + c] && !diag2[rc]) {
                queens[r] = c;
                col[c] = diag1[r + c] = diag2[rc] = true;
                dfs(r+1,n,queens,col,diag1,diag2,ans);
                col[c] = diag1[r + c] = diag2[rc] = false;
            }
        }
    }
}
