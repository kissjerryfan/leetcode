class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int x = root.val;
        if (x > high) {
            return rangeSumBST(root.left, low, high);
        }
        if (x < low) {
            return rangeSumBST(root.right, low, high);
        }
        return x + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
