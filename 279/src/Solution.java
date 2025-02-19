import java.util.Arrays;

class Solution {
    public int numSquares(int n) {
        int[] f = new int[n+1];
        Arrays.fill(f,Integer.MAX_VALUE / 2);
        f[0] = 0;
        for (int i = 0; i * i <= n; i++) {
            for (int j = i * i; j <= n; j++) {
                f[j] = Math.min(f[j],f[j-i*i]+1);
            }
        }
        return f[n];
    }
}
