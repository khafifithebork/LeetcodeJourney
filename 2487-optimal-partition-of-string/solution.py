class Solution:
    def partitionString(self, s: str) -> int:
        count = 1
        sett = set()
        for c in s :
            if c in sett :
                count += 1
                sett = set()
            sett.add(c)
        return count
