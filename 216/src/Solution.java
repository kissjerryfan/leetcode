import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(9, n, k, ans, path);
        return ans;
    }
    private void dfs(int i, int n, int k, List<List<Integer>> ans, List<Integer> path) {
        int d = k - path.size();
        if (n < 0 || n > (2 * i - d + 1) * d / 2) return;
        if (d == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = i; j >= d; j--) {
            path.add(j);
            dfs(j-1,n-j,k,ans,path);
            path.remove(path.size()-1);
        }
    }
}
