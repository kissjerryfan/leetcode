class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        char[] array = s.toCharArray();
        int left = 0;
        int n = array.length;
        boolean[] has = new boolean[128];
        for (int right = 0; right < n; right++) {
            char c = array[right];
            while (has[c]) {
                has[array[left++]] = false;
            }
            has[c] = true;
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
