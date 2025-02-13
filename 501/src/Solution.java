import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private static int max = -1;
    private static List<Integer> arr = new ArrayList<>();
    private static Map<Integer,Integer> map = new HashMap<>();
    public static int[] findMode(TreeNode root) {
        dfs(root);
        int len = arr.size();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int num = arr.get(i);
            if (map.get(num) == max) {
                list.add(num);
                map.put(num,-1);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    private static void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        arr.add(node.val);
        map.put(node.val,map.getOrDefault(node.val,0)+1);
        max = Math.max(map.getOrDefault(node.val,0),max);
        dfs(node.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(1);
        node.left = null;
        int[] res = findMode(node);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
