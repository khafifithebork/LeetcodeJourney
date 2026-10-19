from collections import Counter
class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        freq = Counter(s)
        count = freq[s[0]]
        for c in s : 
            if freq[c] != count :
                return False
        return True

