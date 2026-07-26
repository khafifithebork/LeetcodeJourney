class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        n, m = len(haystack), len(needle)
        if n < m:
            return -1

        for i in range(n - m + 1):

            for j in range(m):
                if haystack[i + j] != needle[j]:
                    break
            else:
                return i
                
        return -1
