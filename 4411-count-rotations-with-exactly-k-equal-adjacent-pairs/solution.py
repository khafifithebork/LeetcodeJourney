class Solution(object):
    def countRotations(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        n = len(s)
        res = 0
        for i in range(n) :
            curr = s[:i] + s[i:]
            score = 0
            for j in range(n-1) :
                if curr[j] == curr[j+1] :
                    score +=1
            if score == k :
                res += 1
            s = s[1:] + s[0]
        return res
