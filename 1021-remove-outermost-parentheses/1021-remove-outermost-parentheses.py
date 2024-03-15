class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        inner = ""
        depth = 0
        
        for c in s:
            if c == '(':
                depth += 1
            if depth > 1:
                inner += c
            if c == ')':
                depth -= 1
        return inner