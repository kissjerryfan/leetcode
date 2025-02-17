import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = Arrays.asList(new Integer[nums.length]);
        boolean[] onPath = new boolean[nums.length];
        dfs(0,nums,onPath,ans,path);
        return ans;
    }
    private void dfs(int i, int[] nums, boolean[] onPath, List<List<Integer>> ans, List<Integer> path) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (!onPath[j]) {
                path.set(i,nums[j]);
                onPath[j] = true;
                dfs(i+1,nums,onPath,ans,path);
                onPath[j] = false;
            }
        }
    }
}
