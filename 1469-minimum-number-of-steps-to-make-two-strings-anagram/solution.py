from collections import Counter

class Solution(object):
    def minSteps(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: int
        """
        freqS = Counter(s)
        freqT = Counter(t)
        ans = 0
        for char, count in freqS.items() :
            ans += max(0, freqS[char] - freqT[char])
        return ans


