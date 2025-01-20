class Solution {
    private int getHeight(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = getHeight(node.left);
        if (leftHeight == -1) return -1;
        int rightHeight = getHeight(node.right);
        if (rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight,rightHeight) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }
}
