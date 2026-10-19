from collections import Counter
class Solution:
    def uniqueOccurrences(self, arr: list[int]) -> bool:
        freq = Counter(arr)
        seen = set()
        for f in freq.values():
            if f not in seen : 
                seen.add(f)
            else :
                return False
        return True
