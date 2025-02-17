import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> ans = new ArrayList<>();
    private char[] path;
    private int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        path = new char[2 * n];
        dfs(0,0);
        return ans;
    }
    private void dfs(int i, int open) {
        if (i == 2 * n) {
            ans.add(new String(path));
            return;
        }
        if (open < n) {
            path[i] = '(';
            dfs(i+1,open+1);
        }
        if (i - open < open) {
            path[i] = ')';
            dfs(i+1,open);
        }
    }
}
