import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] MAPPING = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> ans = new ArrayList<>();
    private char[] path;
    private char[] digits;
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        this.digits = digits.toCharArray();
        path = new char[n];
        if (n == 0) return List.of();
        dfs(0);
        return ans;
    }
    private void dfs(int i) {
        if (i == digits.length) {
            ans.add(new String(path));
            return;
        }
        for (char c : MAPPING[digits[i] - '0'].toCharArray()) {
            path[i] = c;
            dfs(i + 1);
        }
    }
}
