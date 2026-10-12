from collections import Counter

class Solution(object):
    def findThePrefixCommonArray(self, A, B):
        """
        :type A: List[int]
        :type B: List[int]
        :rtype: List[int]
        """
        count = 0
        n = len(A)
        res = []
        freq = Counter()
        for a, b in zip(A, B) :
            freq[a] += 1
            if freq[a] == 2 :
                count += 1
            
            freq[b] += 1
            if freq[b] == 2 :
                count += 1
            
            res.append(count)
        return res
