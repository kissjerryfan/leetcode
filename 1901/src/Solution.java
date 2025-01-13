public class Solution {
    private int indexOfMax(int[] a) {
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[idx]) {
                idx = i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int left = 0;
        int right = mat.length - 1;
        while (left + 1 < right) {
            int i = left + (right - left) / 2;
            int j = indexOfMax(mat[i]);
            if (mat[i][j] > mat[i+1][j]) {
                right = i;
            } else {
                left = i;
            }
        }
        return new int[]{right,indexOfMax(mat[right])};
    }
}
