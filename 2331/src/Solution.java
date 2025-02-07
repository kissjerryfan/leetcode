class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.val == 0) return false;
        if (root.val == 1) return true;
        boolean val = true;
        if (root.val == 2) {
            val = evaluateTree(root.left) || evaluateTree(root.right);
        }
        if (root.val == 3) {
            val = evaluateTree(root.left) && evaluateTree(root.right);
        }
        return val;
    }
}