import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] buckets = new int[20001];
        for (int num : nums) {
            buckets[num + 10000]++;
        }
        for (int i = 20000; i >= 0; i--) {
            k = k - buckets[i];
            if (k <= 0) {
                return i - 10000;
            }
        }
        return 0;
    }
}