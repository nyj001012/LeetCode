public class Solution {
    public string RemoveOuterParentheses(string s) {
        String inner = "";
        int depth = 0;
        
        foreach (char c in s.ToCharArray()) {
            if (c == '(')
                depth++;
            if (depth > 1)
                inner += c;
            if (c == ')')
                depth--;
        }
        return inner;
    }
}