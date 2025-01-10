import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] bucket = new List[n + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int index = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (index == k) {break;}
            if (bucket[i] == null) {continue;}
            List<Integer> list = bucket[i];
            for (int j = 0; j < list.size(); j++) {
                if (index < k) {
                    res[index++] = list.get(j);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        int[] res = topKFrequent(nums, 2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}