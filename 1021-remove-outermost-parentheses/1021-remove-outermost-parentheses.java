class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder inner = new StringBuilder();
        int depth = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(')
                depth++;
            if (depth > 1)
                inner.append(c);
            if (c == ')')
                depth--;
        }
        return inner.toString();
    }
}