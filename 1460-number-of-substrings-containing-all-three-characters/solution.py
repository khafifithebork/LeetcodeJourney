from collections import Counter
class Solution(object):
    def numberOfSubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        l = 0
        res = 0
        distinct = 0
        freq = Counter()
        for r in range(len(s)) :
            if freq[s[r]] == 0 :
                distinct +=1
            freq[s[r]] +=1
            while distinct == 3 :
                res += len(s) - r
                freq[s[l]] -= 1
                if freq[s[l]] == 0 :
                    distinct -= 1
                l+=1
        return res

