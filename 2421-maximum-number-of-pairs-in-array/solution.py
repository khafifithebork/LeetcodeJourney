from collections import Counter

class Solution(object):
    def numberOfPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        freq = Counter(nums)
        ans = [0]*2

        for val in freq.values() :
            ans[0] += (val//2)
            ans[1] += (val%2)
        return ans

