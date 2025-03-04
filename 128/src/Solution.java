import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (set.contains(num-1)) continue;
            int y = num + 1;
            while (set.contains(y)) y++;
            ans = Math.max(ans,y-num);
        }
        return ans;
    }
}
