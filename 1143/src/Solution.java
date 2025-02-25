class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] b = text2.toCharArray();
        int len = b.length;
        int[] f = new int[len+1];
        for (char x : text1.toCharArray()) {
            int pre = 0;
            for (int j = 0; j < len; j++) {
                int tmp = f[j+1];
                f[j+1] = x == b[j] ? pre + 1 : Math.max(f[j+1],f[j]);
                pre = tmp;
            }
        }
        return f[len];
    }
}
