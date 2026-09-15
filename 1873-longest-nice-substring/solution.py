class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        if len(s) < 2 :
            return ""
        for i, char in enumerate(s):
            if char.swapcase() not in s :
                left_part = self.longestNiceSubstring(s[:i])
                right_part = self.longestNiceSubstring(s[i+1:])
                return left_part if len(left_part) >= len(right_part) else right_part
        return s
