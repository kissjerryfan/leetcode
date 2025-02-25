class Solution {
    public int minDistance(String word1, String word2) {
        char[] t = word2.toCharArray();
        int len = t.length;
        int[] f = new int[len+1];
        for (int j = 1;j <= len; j++) {
            f[j] = j;
        }
        for (char x : word1.toCharArray()) {
            int pre = f[0];
            f[0]++;
            for (int j = 0; j < len; j++) {
                int tmp = f[j+1];
                f[j+1] = x == t[j] ? pre : Math.min(Math.min(f[j],f[j+1]),pre) + 1;
                pre = tmp;
            }
        }
        return f[len];
    }
}
