class Solution:
    def minimizedStringLength(self, s: str) -> int:
        seen = set()
        for c in s :
            seen.add(c)
        return len(seen)
