import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0, minDiff = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int x = nums[i];
            if (i > 0 && x == nums[i-1]) {
                continue;
            }
            int s = x + nums[i+1] + nums[i+2];
            if (s == target) return target;
            if (s > target) {
                if (s - target < minDiff) {
                    return s;
                }
            }
            s = x + nums[n-1] + nums[n-2];
            if (s == target) return target;
            if (s < target) {
                if (target - s < minDiff) {
                    minDiff = target - s;
                    ans = s;
                }
                continue;
            }
            int j = i + 1, k = n - 1;
            while (j < k) {
                s = x + nums[j] + nums[k];
                if (s == target) {
                    return target;
                } else if (s > target) {
                    if (s - target < minDiff) {
                        minDiff = s - target;
                        ans = s;
                    }
                    k--;
                } else {
                    if (target - s < minDiff) {
                        minDiff = target - s;
                        ans = s;
                    }
                    j++;
                }
            }
        }
        return ans;
    }
}