class Solution {
    private int res = Integer.MAX_VALUE;
    private int pre = Integer.MIN_VALUE / 2;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return res;
    }
    private void dfs (TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        res = Math.min(res, node.val - pre);
        pre = node.val;
        dfs(node.right);
    }
}
