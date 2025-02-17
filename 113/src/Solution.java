import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, ans, path);
        return ans;
    }
    private void dfs(TreeNode node, int targetSum, List<List<Integer>> ans, List<Integer> path) {
        if (node == null) return;
        path.add(node.val);
        targetSum -= node.val;
        if (node.left == node.right && targetSum == 0) {
            ans.add(new ArrayList<>(path));
        }
        dfs(node.left, targetSum, ans, path);
        dfs(node.right, targetSum, ans, path);
        path.remove(path.size() - 1);
    }
}
