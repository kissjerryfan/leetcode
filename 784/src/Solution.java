import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> ans = new ArrayList<>();
    private String s;
    private char[] path;
    public List<String> letterCasePermutation(String s) {
        int n = s.length();
        path = new char[n];
        dfs(0);
        return ans;
    }
    private void dfs(int i) {
        if (i == s.length()) {
            ans.add(new String(path));
            return;
        }
        if (Character.isLetter(s.charAt(i))) {
            path[i] = Character.toLowerCase(s.charAt(i));
            dfs(i+1);
            path[i] = Character.toUpperCase(s.charAt(i));
            dfs(i+1);
        } else {
            path[i] = s.charAt(i);
            dfs(i+1);
        }
    }
}
