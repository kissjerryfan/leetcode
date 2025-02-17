import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();
    private int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        dfs(0);
        return ans;
    }
    private void dfs(int i) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        dfs(i+1);
        path.add(nums[i]);
        dfs(i+1);
        path.remove(path.size()-1);
    }
}
