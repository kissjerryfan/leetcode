import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        int n = list.size();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = list.get(i);
        }
        List<List<Integer>> ans = new ArrayList<>(queries.size());
        for (int q : queries) {
            int j = lowerBound(a,q);
            int max = j == n ? -1 : a[j];
            if (j == n || a[j] != q) {
                j--;
            }
            int min = j < 0 ? -1 : a[j];
            ans.add(List.of(min,max));
        }
        return ans;
    }
    private void dfs(TreeNode node, List<Integer> list) {
        if (node == null) return;
        dfs(node.left,list);
        list.add(node.val);
        dfs(node.right,list);
    }
    private int lowerBound(int[] a, int target) {
        int left = -1, right = a.length;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (target <= a[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}
