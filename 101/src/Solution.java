class Solution {
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return p.val == q.val && isSameTree(p.left,q.right) && isSameTree(p.right,q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left,root.right);
    }
}
