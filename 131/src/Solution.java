import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<String>> ans = new ArrayList<>();
    private List<String> path = new ArrayList<>();
    private String s;
    public List<List<String>> partition(String s) {
        this.s = s;
        dfs(0);
        return ans;
    }
    private void dfs (int i) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(i,j+1)) {
                path.add(s.substring(i,j+1));
                dfs(j+1);
                path.remove(path.size() - 1);
            }
        }
    }
    private boolean isPalindrome (int left, int right) {
        while (left < right) {
            if(s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
